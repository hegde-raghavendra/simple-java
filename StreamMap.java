import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "value1");
        map.put(2, "value2");

        System.out.println(map.entrySet().stream().map(s->s.getValue()).collect(Collectors.joining(",")));
    }
    
}
