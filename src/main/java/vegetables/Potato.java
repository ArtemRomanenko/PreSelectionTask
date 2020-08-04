package vegetables;

import reader.CaloriesReader;

public class Potato implements Vegetable {

    public void washingVegetables() {
        System.out.println("Cabbage is washed");
    }

    public void cutVegetables() {
        System.out.println("Cabbage is sliced");
    }

    @Override
    public int returnCalories() {
        return new CaloriesReader().reader().getPotato();
    }

    @Override
    public boolean isPeeled() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Potato's calories = %s", returnCalories());
    }
}
