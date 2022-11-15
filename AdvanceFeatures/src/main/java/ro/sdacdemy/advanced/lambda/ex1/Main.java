package ro.sdacdemy.advanced.lambda.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(50);
        list.add(70);
        list.add(99);
        list.add(123);
        list.add(213);
        list.add(435);
        list.add(73);


        for (Integer el : list) {
            System.out.println(el);
        }

        System.out.println("------------------");


        list.forEach((Integer e) -> {
            System.out.println(e);
        });


        MyFuncInterface myIntrf1 = (String a) -> {
            System.out.println(a);
        };


        myIntrf1.doSomething("ronaldo");


        MyFuncInterface myOtherInterf = (String var) -> {
            System.out.println(var.toUpperCase());
        };

        myOtherInterf.doSomething("ronaldo");

        myOtherInterf.doSomething("messi");


        System.out.println("-----------------------------");


        OperationInterface add = (a, b) -> a + b;

        OperationInterface subtraction = (a, b) -> {
            return a - b;
        };

        OperationInterface multiply = (int a, int b) -> {
            return a * b;
        };


        System.out.println(add.operation(10, 100));

        System.out.println(subtraction.operation(999, 100));

        System.out.println(multiply.operation(10000, 3));


        System.out.println("----------------------------------");


        Consumer<String> consumer = (String s) -> System.out.println(s);

        Supplier<String> supplier = () -> {
            return "Leo Messi";
        };

        Predicate<Integer> predicate = (Integer a) -> {
            return a > 100;
        };

        Function<Integer, Double> function = (Integer a) -> {
            return a + 100.0;
        };


        consumer.accept("my string");
        consumer.accept("my string 2");
        consumer.accept("my string 3");


        String var = supplier.get();
        System.out.println(var);


        boolean result = predicate.test(99);
        System.out.println(result);

        System.out.println(predicate.test(1000));


        double myDouble = function.apply(50);
        System.out.println(myDouble);

    }

}
