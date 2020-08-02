package vegetables;

public class Tomato implements Vegetable {
    final private int calories = 45;

    public void washingVegetables() {
        System.out.println("Tomato is washed");
    }

    public void cutVegetables() {
        System.out.println("Tomato is sliced");
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
        return String.format("Tomato's calories = %s", calories);
    }
}
