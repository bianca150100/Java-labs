
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 10);
        String k = l.stream().map(i -> (i % 2 == 0 ? "p" : "i") + i)
                .collect(Collectors.joining(","));
        System.out.println(k);
    }
}
