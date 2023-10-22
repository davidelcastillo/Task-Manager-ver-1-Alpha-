package Weather;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Usuario
 */
public class WeatherApp {
    public static JSONObject getWeatherData () {
        JSONArray locationData = getLocationData();

        JSONObject location = (JSONObject) locationData.get(0);
        double latitude = (double) location.get("latitude");
        double longitude = (double) location.get("longitude");
        
        // build API reques URL with location coordinates
        String urlString = "https://api.open-meteo.com/v1/forecast?latitude=-24.7859&longitude=-65.4117&hourly=temperature_2m,weathercode&timezone=auto";
        
        try {
            // call api and get response
            HttpURLConnection conn = fetchApiResponse (urlString);
            
            // check response status (200 means successful conection
            if(conn.getResponseCode() != 200) {
                System.out.print("Error, no se pudo conectar a al API");
                return null;
            } 
            
            // store the API results
                StringBuilder resultJson = new StringBuilder();
                Scanner sc = new Scanner(conn.getInputStream());
                
             //read and store the resulting json data into our string builder
                while (sc.hasNext()) {
                    resultJson.append(sc.nextLine());
                }
                
                sc.close();
                
                //close url connection
                conn.disconnect();
                
                 //parse throught our data
                JSONParser parser = new JSONParser();
                JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));
                
                // retrieve hourly data
                JSONObject hourly = (JSONObject) resultJsonObj.get("hourly");
                
                
                JSONArray time = (JSONArray) hourly.get("time");
                int index = findIndexOfCurrentTime (time);
                
                // get temperature
                JSONArray temperatureData = (JSONArray) hourly.get("temperature_2m");
                double temperature = (double) temperatureData.get(index);
                
                // get Weather code
                 JSONArray weathercode = (JSONArray) hourly.get("weathercode");
                 String weatherCondition = convertWeatherCode ((long) weathercode.get(index));
                 
                 // build the weather json data object
                 JSONObject weatherData = new JSONObject();
                 weatherData.put("temperature", temperature);
                 weatherData.put("weather_condition", weatherCondition);
                 
                 return weatherData;
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static JSONArray getLocationData() {
        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=Salta&count=10&language=en&format=json";
        
        try {
            // call API and get a response
            HttpURLConnection conn = fetchApiResponse (urlString);
            
            // check response status (200 means successful conection
            if(conn.getResponseCode() != 200) {
                System.out.print("Error, no se pudo conectar a al API");
                return null;
            } else {
                // store the API results
                StringBuilder resultJson = new StringBuilder();
                Scanner sc = new Scanner(conn.getInputStream());
                
                //read and store the resulting json data into our string builder
                while (sc.hasNext()) {
                    resultJson.append(sc.nextLine());
                }
                
                sc.close();
                
                //close url connection
                conn.disconnect();
                
                //parse the JSON string into a JSON obj
                JSONParser parser = new JSONParser();
                JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));
                
                // get the list of location data the API genertaed from location name
                JSONArray locationData = (JSONArray) resultJsonObj.get("results");
                return locationData;
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static HttpURLConnection fetchApiResponse (String urlString) {
        try {
            // attempt to create conection
            URL url = new URL (urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            //set request method to get
            conn.setRequestMethod("GET");
            
            // concet to our API
            conn.connect();
            return conn; 
        } catch (IOException e) {
            e.printStackTrace();
        }

        //could not make conection
        return null;
    }


    private static int findIndexOfCurrentTime (JSONArray timeLst) {
        String currentTime = getCurrentTime();
        
        // iterate trought the time list and see which one matches our current time
        for ( int i = 0; i < timeLst.size(); i++) {
            String time = (String) timeLst.get(i);
            if (time.equalsIgnoreCase(currentTime)) {
                // return the index
                return i;
            }
        }
        return 0;
    }

    public static String getCurrentTime() {
        // get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // format date 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T''HH'':00'");
        
        // format and print the current date n' time
        String formattedDateTime = currentDateTime.format(formatter);
        
        return formattedDateTime;   
    }
    
    // convert the weather code to something more readable
    private static String convertWeatherCode (long weathercode) {
        String weatherCondition = "";
        if (weathercode == 0) weatherCondition = "Clear";
        else if (weathercode <= 3L && weathercode > 0L) weatherCondition = "Cloudy";
        else if ((weathercode <= 67L && weathercode >= 51L)
                || (weathercode <= 99L && weathercode >= 80L) ) weatherCondition = "Rain";
        else if (weathercode <= 77L && weathercode >= 71L) weatherCondition = "Snow";
        
        return weatherCondition;
    }

}