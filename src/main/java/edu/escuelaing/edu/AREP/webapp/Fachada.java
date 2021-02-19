package edu.escuelaing.edu.AREP.webapp;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class Fachada {


    public static JSONObject getValue(String number, String operation) throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://caltrigonometricaeci.herokuapp.com/?value=" + number + "&a="+operation)
                .asString();
        return new JSONObject(response.getBody());
    }
}