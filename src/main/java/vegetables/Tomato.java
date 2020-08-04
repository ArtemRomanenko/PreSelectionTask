package vegetables;

import reader.CaloriesReader;

public class Tomato implements Vegetable {

    public void washingVegetables() {
        System.out.println("Tomato is washed");
    }

    public void cutVegetables() {
        System.out.println("Tomato is sliced");
    }

    @Override
    public int returnCalories() {
        return new CaloriesReader().reader().getTomato();
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Tomato's calories = %s", returnCalories());
    }
}
