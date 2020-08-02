package kitchen;

import recipe.RecipeSaver;
import vegetables.*;
import salads.Salad;
import salads.VillageSalad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreparedSalad {
    private Salad salad = new VillageSalad();
    private List<Vegetable> allVegetables = new ArrayList<>(Arrays.asList(new Cabbage()
            , new Potato()
            , new Cucumber()
            , new Tomato()));

    public void prepareSalad() {
        List<Vegetable> sortVega = salad.sortedVeg(allVegetables);
        salad.makeASalad(sortVega);
        salad.caloriesOfTheSalad(sortVega);
        System.out.println("Salad is ready");
        new RecipeSaver().recipeStorage(sortVega.toString());
    }

}
