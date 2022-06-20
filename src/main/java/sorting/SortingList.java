package sorting;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class SortingList {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Ispw", "Davide", "Giulio", "Guglielmo", "Francesco", "Sonia");
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        sortedList.add(0,"startFromHere");
        //qui si stampa a schermo la prima lista sorted
        //gave you the list sorted

        //if u want to add others

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<String> sortedList1 = stringList.stream().sorted().collect(Collectors.toList());
        sortedList1.add(1,string);
        sortedList1.add(0,"startFromHere");
        //qui si stampa a schermo la seconda lista con l'aggiunta da terminale di una stringa



    }
}
