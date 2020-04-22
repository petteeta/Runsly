package com.glacierwebcreative.runsly;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ObstacleRaceActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.races_list);

        downloadJSON("http://runsly.pettee.net/races_db_activity.php");
    }



    private void downloadJSON(final String urlWebservice) {

        class DownloadJSON extends AsyncTask<Void, Void, String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }


            @Override
            protected String doInBackground(Void... voids) {
                try {
                    URL url = new URL(urlWebservice);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();

                    con.setRequestMethod("POST");
                    con.setDoOutput(true);
                    String params = "category=3";

                    OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
                    writer.write(params);
                    writer.flush();
                    writer.close();


                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json + "\n");
                    }

                    return sb.toString().trim();

                } catch (Exception e) {
                    return null;
                }
            }


            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();

                try {
                    loadIntoListView(s);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        DownloadJSON getJSON = new DownloadJSON();
        getJSON.execute();
    }


    private void loadIntoListView(String json) throws JSONException {

        JSONArray jsonArray = new JSONArray(json);
        final ArrayList<Race> racesList = new ArrayList<>();


        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);

            int id = obj.getInt("id");
            String rn = obj.getString("race_name");
            int rc = obj.getInt("race_category");
            String rcs = obj.getString("race_city_state");
            String ar = obj.getString("available_races");
            String se = obj.getString("season");
            String mo = obj.getString("month");
            int dm = obj.getInt("day_in_month");
            String dor = obj.getString("director_organizer");
            String sy = obj.getString("synopsis");
            String rw = obj.getString("race_website");


            racesList.add(new Race(id, rn, rc, rcs, ar, se, mo, dm, dor, sy, rw));

        }
        //System.out.println(racesList);
        ListView listView = findViewById(R.id.races_list);

        RaceAdapter adapter = new RaceAdapter(this, racesList);
        listView.setAdapter(adapter);

        // Set Item onClickListener
        listView.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent raceProfile = new Intent(getApplicationContext(), RaceProfileActivity.class);
                Race currentRace = racesList.get(position);
                //System.out.println(currentRace);
                raceProfile.putExtra("CurrentRace", currentRace);
                startActivity(raceProfile);
            }
        }));
    }







}