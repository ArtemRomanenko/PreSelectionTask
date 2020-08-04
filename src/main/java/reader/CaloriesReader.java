package reader;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CaloriesReader {
    private VegetablesCalories vegetablesCalories;

    public VegetablesCalories reader()  {
        try {
            Gson gson = new Gson();
            vegetablesCalories = gson.fromJson(new FileReader("JsonFile")
                    , VegetablesCalories.class);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return vegetablesCalories;
    }
}
