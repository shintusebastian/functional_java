

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Apple> apples= Arrays.asList(
                (Apple.builder().type(AppleType.GREEN).variety("Green").price(6.99D).build()),
        (Apple.builder().type(AppleType.RED).variety("Macintosh").price(8.99D).build()),
                (Apple.builder().type(AppleType.RED).variety("Gala").price(4.99D).build()),
                (Apple.builder().type(AppleType.RED).variety("Red Delicious").price(9.99D).build()),
                (Apple.builder().type(AppleType.RED).variety("Fuji").price(5.99D).build()),
                (Apple.builder().type(AppleType.GREEN).variety("Granny Smith").price(7.50D).build()),
                (Apple.builder().type(AppleType.GREEN).variety("Shamrock").price(6.50D).build()),
                (Apple.builder().type(AppleType.RED).variety("Honey Crisp").price(11.50D).build()),
        (Apple.builder().type(AppleType.RED).variety("Gala").price(4.99D).build()),
                (Apple.builder().type(AppleType.GREEN).variety("Granny Smith").price(7.50D).build()),
                (Apple.builder().type(AppleType.RED).variety("Red Delicious").price(9.99D).build())

        );
        long greenApplesCount = apples.stream().filter(d -> d.getType() == AppleType.GREEN).count();
        System.out.println(greenApplesCount);
        long redApplesCount = apples.stream().filter(d -> d.getType() == AppleType.RED).count();
        System.out.println(redApplesCount);
        Map<String, List<Apple>> collect = apples.stream().collect(Collectors.groupingBy(Apple::getVariety));

        System.out.println(collect);
        Stream<Apple> red_delicious = apples.stream().filter(d -> d.getVariety().equals("Red Delicious")).map(d -> {
            d.getPrice();
            return d;
        });
        System.out.println(red_delicious); //


    }
}
