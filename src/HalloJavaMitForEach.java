import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalloJavaMitForEach {

    List<String> stringList= Arrays.asList("Hallo", "Java","Mit","For","List");

    public void ausgeben(){
        for (String string:stringList) {
            System.out.println(string);
        }
        stringList.forEach((String s) -> System.out.println(s));
        stringList.forEach(System.out::println);
    }




}
