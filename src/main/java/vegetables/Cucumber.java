package vegetables;

import reader.CaloriesReader;

public class Cucumber implements Vegetable {

    public void washingVegetables() {
        System.out.println("Cucumber is washed");
    }

    public void cutVegetables() {
        System.out.println("Cucumber is sliced");
    }

    @Override
    public int returnCalories() {
        return new CaloriesReader().reader().getCucumber();
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Cucumber's calories = %s", returnCalories());
    }
}
