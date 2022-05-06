import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //List<String> namesList = List.of("Shintu", "Neethu", "Adeline", "Jerin", "Alfeena", "Chinchu", "Bichu"); this
        // will throw error.
        List<String> namesList = Arrays.asList("Shintu", "Neethu", "Adeline", "Jerin", "Alfeena", "Chinchu", "Bichu");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        namesList.forEach(System.out::println);
//        System.out.println("Before sorting "+namesList);
        // namesList.sort(comparator);
//        System.out.println("After sorting "+namesList);
        System.out.println("Before sorting " + namesList);
        // namesList.sort(String::compareTo);//Very important.
        //Here we say, take the implementation of this method and use it.


        // namesList.sort(( first, second)->first.compareTo(second));// we don't care about the type, actually.
        //the IDE says that we can replace this with the Comparator.Natural order.
        namesList.sort(Comparator.naturalOrder());


        System.out.println("After sorting " + namesList);

//        namesList.sort(Test::myCompare);
        System.out.println("Sorting by Name length" + namesList);

        Play play = (team1, team2) -> String.valueOf(team1.length() - team2.length());
        System.out.println(play.game("Canada", "India"));
        // another example of the above implementation is:
        Play play1 = (a, b) -> a.length() > b.length() ? a : b;
        System.out.println(play1.game("Brazil", "Argentina"));
        Play play2 = (a, b) -> Math.random() > 0.5 ? a : b;
        System.out.println(play.game("India", "Australia"));
//    public static int myCompare(String o1, String o2){
//        return o1.length()-o2.length();
//    }
        System.out.println(9 % 10);
    }
}
