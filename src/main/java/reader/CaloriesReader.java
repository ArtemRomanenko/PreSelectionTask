package reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class CaloriesReader {

    private JSONParser parser;
    private JSONObject jsonObject = null;
    private final String cabbage = (String) readFromFile().get("cabbage");
    private final int cabbageCal = Integer.parseInt(cabbage);
    private final String cucumber = (String) readFromFile().get("cucumber");
    private final int cucumberCal = Integer.parseInt(cucumber);
    private final String tomato = (String) readFromFile().get("tomato");
    private final int tomatoCal = Integer.parseInt(tomato);
    private final String potato = (String) readFromFile().get("potato");
    private final int potatoCal = Integer.parseInt(potato);

    public int getCabbageCal() {
        return cabbageCal;
    }

    public int getCucumberCal() {
        return cucumberCal;
    }

    public int getTomatoCal() {
        return tomatoCal;
    }

    public int getPotatoCal() {
        return potatoCal;
    }

    private JSONObject readFromFile() {
        try {
            parser = new JSONParser();
            jsonObject = (JSONObject)
                    parser.parse(new java.io.FileReader("JsonFile"));
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
