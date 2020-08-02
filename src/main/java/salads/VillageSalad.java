package salads;

import vegetables.Vegetable;

import java.util.List;
import java.util.stream.Collectors;


public class VillageSalad implements Salad {

    @Override
    public void makeASalad(List<Vegetable> vegetableList) {
        vegetableList.forEach(Vegetable::washingVegetables);
        vegetableList.forEach(Vegetable::cutVegetables);
    }

    @Override
    public void caloriesOfTheSalad(List<Vegetable> calories) {
        int cal = calories.stream()
                .map(Vegetable::returnCalories)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Total calories of the salad = " + cal);
    }

    @Override
    public List<Vegetable> sortedVeg(List<Vegetable> vegetableList) {
        System.out.println("Vegetables are sorted");
        return vegetableList.stream()
                .filter(Vegetable::isPeeled)
                .collect(Collectors.toList());
    }
}
