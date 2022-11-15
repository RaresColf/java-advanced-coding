package ro.sdacdemy.advanced.lambda.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *  /*
 *         Write code to print the items in the list in sorted order,
 *         and with the first letter in each name upper-cased.
 *         The name "harry" should be printed as "Harry" and should be printed
 *         after "Emily" and before "Isla". Use lambda expressions wherever possible.
 *

         *List<String> topNames2015=Arrays.asList(
        *"Amelia",
        *"olivia",
        *"emily",
        *"isla",
        *"ava",
        *"oliver",
        *"Jack",
        *"Charlie",
        *"harry",
        *"Jacob"
        *);
 * */
public class Main {

 public static void main(String[] args) {

    List<String> topNames2015= Arrays.asList(   // asList e o scurtatura pentru a nu a adauga cate un element sperata cu metoda add
            "Amelia",
            "olivia",
            "emily",
            "isla",
            "ava",
            "oliver",
            "Jack",
            "Charlie",
            "harry",
            "Jacob");

    List<String> firstNameUpperCase = new ArrayList<>();


    topNames2015.forEach(
            (String currentIterarion) -> firstNameUpperCase.add(currentIterarion.substring(0,1).toUpperCase() +
                    currentIterarion.substring(1))
    );

    firstNameUpperCase.sort((a,b) -> a.compareTo(b));                     // am scris doar a si b pentru ca isi da seama singur ca este vorba despre 2 stringuri

    firstNameUpperCase.forEach((String s) -> System.out.println(s));

  System.out.println("----------------------------------------------------------");



 }

}
