package salads;

import vegetables.Vegetable;

import java.util.List;

public interface Salad {
    void makeASalad(List<Vegetable> vegetableList);

    void caloriesOfTheSalad(List<Vegetable> calories);

    List<Vegetable> sortedVeg(List<Vegetable> vegetableList);
}
