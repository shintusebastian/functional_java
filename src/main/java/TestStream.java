import java.util.Arrays;
import javax.script.*;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(() -> "Hello from stream");
//        stream.limit(5).forEach(System.out::println);//this will print "Hello from stream" infinitely.
//Stream is done here and in below line we are working on the Dish class.
        Dish dish =
                Dish.builder().name("Samosa").build();//testing if the lombok is working

        dish.setDishType(DishType.VEGETARIAN);
        dish.setCost(6.5D);

        dish.setIngredients(Collections.singletonList("Frozen puff pastry"));

        System.out.println(dish.getIngredients());
        System.out.println(dish);


    }



}
