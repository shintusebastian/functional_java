import lombok.Builder;
import lombok.Data;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Runner {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList
                ((Dish.builder().name("Butter Chicken").
                                dishType(DishType.NON_VEG).cost(13.99)
                                .ingredients(Arrays.asList("Chicken", "Butter", "Spices")).build()),
                        (Dish.builder().name("Butter Paneer").dishType(DishType.VEGETARIAN)
                                .ingredients(Arrays.asList("Butter", "Paneer", "Spices"))
                                .cost(12.99).build()),
                        (Dish.builder().name("Fish Pakoda").dishType(DishType.NON_VEG)
                                .cost(9.99).ingredients(Arrays.asList("Fish", "Spices", "Flour")).build()),
                        (Dish.builder().name("Beef Masala").dishType(DishType.NON_VEG)
                                .cost(15.99).ingredients(Arrays.asList("Beef", "Spices")).build()),
                        (Dish.builder().name("Mutton Biriyani").dishType(DishType.NON_VEG)
                                .cost(14.99).ingredients(Arrays.asList("Mutton", "Spices", "Onion", "Tomato", "Basmati Rice"))
                                .build())
                );
//dishes.stream().filter(d->d.getDishType()==DishType.VEGETARIAN).forEach(System.out::println);

        List<Dish> dishList = dishes.stream().filter(d -> d.getDishType() == DishType.VEGETARIAN).collect(Collectors.toList());
        // here we got the subset of dishes which is filtered by dish type.

//        dishes.stream().filter(d->d.getDishType()==DishType.NON_VEG).forEach(d->d.setCost(d.getCost()+2));
//        dishes.stream().filter(d->d.getDishType()==DishType.NON_VEG).forEach(System.out::println);
        //above code also increases the price of each item by 2.

        List<Dish> newPrice = dishes.stream().filter(d -> d.getDishType() == DishType.NON_VEG).map(d -> {
            d.setCost(d.getCost() + 2);
            return d;
        }).collect(Collectors.toList());//
        System.out.println(newPrice);
        Optional<Double> max = dishes.stream().map(d -> d.getCost()).max(Comparator.naturalOrder());// we are finding the
        //largest cost in the given list.
        System.out.println(max);
        max.ifPresent(System.out::println);// printing the same amount in a different way.

        Map<DishType, List<Dish>> dishMap = dishes.stream().collect(Collectors.groupingBy(Dish::getDishType));
        // Here we collect the stream of data and grouped them
// according to the dish type. It has two keys(veg/non-veg)
        System.out.println(dishMap);
List<Integer>nums=List.of(1,76,38,127,12,19,17);
        System.out.println(nums.stream().reduce(0, (a, b) -> a + b));//sum of given numbers using reduction.
        //identity 0 means the sum is starting from zero.
        List<String> ingredients = dishes.stream().flatMap(d -> d.getIngredients().stream()).distinct().collect(Collectors.toList());//here, we are collecting different
        //ingredients from the stream of ingredients.
        System.out.println(ingredients);

        String firstlast[][]={//declaring a 2D string array
                {"Shintu","Sebastian"},
                {"Neethu","Thomas"},
                {"Adeline","Margaret"}
        };
        System.out.println(firstlast);


    }

}
