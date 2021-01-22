import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    private List<Integer> intList = new ArrayList<>();

    public StreamMain(List<Integer> intList) {
        this.intList = intList;
    }

    public void tronsformAndPrintIntList () {
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0).filter(x -> x != 0 && x % 2 == 0).sorted().forEach(x -> System.out.print(x + " "));
    }
}
