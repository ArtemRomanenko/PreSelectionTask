package vegetables;

public class Cabbage implements Vegetable {
    final private int calories = 25;

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
        return true;
    }
}
