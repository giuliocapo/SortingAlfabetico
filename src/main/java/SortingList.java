
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class SortingList {
    public static void main(String args[]) {

        List<String> stringList = Arrays.asList("Ispw", "Davide", "Giulio", "Guglielmo", "Francesco", "Sonia");
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        sortedList.add(2,"fra");
        stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
