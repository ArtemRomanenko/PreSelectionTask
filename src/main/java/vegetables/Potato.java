package vegetables;

public class Potato implements Vegetable {
    final private int calories = 50;

    public void washingVegetables() {
        System.out.println("Cabbage is washed");
    }

    public void cutVegetables() {
        System.out.println("Cabbage is sliced");
    }

    @Override
    public int returnCalories() {
        return calories;
    }

    @Override
    public boolean isPeeled() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Potato's calories = %s", calories);
    }
}
