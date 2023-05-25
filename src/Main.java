import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        var member = List.of("Mitoma","Minamino","Tomiyasu","Tanaka" );

        var result = member.stream().filter(s -> s.startsWith("M")).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);

    }
}