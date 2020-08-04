package vegetables;

import reader.CaloriesReader;

public class Cabbage implements Vegetable {

    public void washingVegetables() {
        System.out.println("Cabbage is washed");
    }

    public void cutVegetables() {
        System.out.println("Cabbage is sliced");
    }

    @Override
    public int returnCalories() {
        return new CaloriesReader().getCabbageCal();
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Cabbage's calories = %s", returnCalories());
    }
}
