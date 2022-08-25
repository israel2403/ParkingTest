import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

  // To run this program just got to bin folder inside this project and run Java App
  public static void main(String[] args) throws Exception {
    File file = new File(
      "/home/isra/git/java/parkingTest/ParkingTest/test_case.txt"
    );
    final Scanner scanner = new Scanner(file);
    final List<String> list = new ArrayList<>();
    while (scanner.hasNextLine()) {
      list.add(scanner.nextLine());
    }
    list.remove("1");
    list.remove("1301");
    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    l2.add("");
    l2.add("");
    for (String tuple : list) {
       l1 = Arrays.asList(tuple.split(" "));
       for (int i = 0; i < l1.size(); i++) {
        
       }
    }
  }
}
