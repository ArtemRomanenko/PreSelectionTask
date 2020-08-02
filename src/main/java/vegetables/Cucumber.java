package vegetables;

public class Cucumber implements Vegetable {
    final private int calories = 30;

    public void washingVegetables() {
        System.out.println("Cucumber is washed");
    }

    public void cutVegetables() {
        System.out.println("Cucumber is sliced");
    }

    @Override
    public int returnCalories() {
        return calories;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Cucumber's calories = %s", calories);
    }
}
