import java.util.Optional;

public class OptionalWrapper {

    public static void main(String[] args) {
        Integer i = null;
        Integer j = 10;
        Optional<Integer> a = Optional.ofNullable(i);
        Optional<Integer> b = Optional.of(j);
        System.out.println(a.isPresent() +" " + b.isPresent());
    }
}
