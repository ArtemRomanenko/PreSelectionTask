package salads;

import exception.MyException;
import vegetables.Vegetable;

import java.util.List;
import java.util.stream.Collectors;


public class VillageSalad implements Salad {

    @Override
    public void makeASalad(List<Vegetable> vegetableList) {
        if (vegetableList.isEmpty()) {
            try {
                throw new MyException("You don't have any vegetables. Please go to the market");
            } catch (MyException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        vegetableList.forEach(Vegetable::washingVegetables);
        vegetableList.forEach(Vegetable::cutVegetables);
    }

    @Override
    public void caloriesOfTheSalad(List<Vegetable> calories) {
        int cal = calories.stream()
                .map(Vegetable::returnCalories)
                .mapToInt(Integer::intValue)
                .sum();
        if (cal > 500) {
            try {
                throw new MyException("There is more than 500 cal. It's not a healthy salad");
            } catch (MyException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
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
