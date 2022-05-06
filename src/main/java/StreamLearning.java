import lombok.NonNull;

import java.util.Optional;

public class StreamLearning {
    public static void main(String[] args) {
        //dealWithApple(Optional.empty());// here we are passing a null to the method
       // dealWithApple(Optional.of(new Apple()));
       // dealWithApple(null);// it throws error that apple is marked non-null but is null
dealWithApple(Optional.ofNullable(null));// this code will compiler. Because we are passing an optional to it.
        //dealWithApple(Optional.ofNullable(null)); this is similar to the above code.
    }

    public static void dealWithApple(@NonNull Optional<Apple> apple) {// we can mark @NonNull marker in the lombok and make sure we are not passing a null value to this method.
        apple.ifPresentOrElse(System.out::println,()-> System.out.println("All Good"));// This will print the value if there is any value.
        // or else it will print "All Good".
        if (apple.isPresent()) {
            Apple apple1 = apple.get();
        }// this code will get the value at apple if there is any value present.

        apple.ifPresent(System.out::println);
apple.map(d-> {d.setType(AppleType.GREEN); return d;}).ifPresent(System.out::println);// we can map it.
    }
}
