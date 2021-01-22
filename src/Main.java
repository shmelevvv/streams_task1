import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    private List<Integer> intList = new ArrayList<>();

    public Main(List<Integer> intList) {
        this.intList = intList;
    }

    public void tronsformAndPrintIntList () {
        for(int i : ascSort(findEven(filterPositive(intList)))) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> filterPositive (List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : intList) {
            if (i > 0) result.add(i);
        }
        return result;
    }

    private List<Integer> findEven (List<Integer> intList) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : intList) {
            if (i != 0 && i % 2 == 0) result.add(i);
        }
        return result;
    }

    private List<Integer> ascSort (List<Integer> intList) {
        Collections.sort(intList);
        return intList;
    }
}
