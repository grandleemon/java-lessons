package L33Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
  public static void main(String[] args) {
    List animals = new ArrayList();
    animals.add("cat");
    animals.add("pig");
    animals.add("dog");

    String animal = (String) animals.get(0);
    //////////////////
    List<String> animals2 = new ArrayList<>();
    animals2.add("cat");
    animals2.add("dog");

    String animal2 = animals2.get(1);
  }
}
