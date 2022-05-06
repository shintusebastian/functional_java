import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<String> sample= Arrays.asList("Canaday","INdia","Australia","China","Dubai");
        List<String> stringList = sample.stream().map(d -> d + "y").toList();//collect(Collectors.toList()) can be replaced with .toList().
//stringList.removeIf(s->s.contains("yy"));
//        String jdk=null;
//        System.out.println(jdk.toUpperCase(Locale.ROOT));
    }


}
