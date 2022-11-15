package ro.sdacdemy.advanced.lambda.ex1;

// is the same as we did with the lambda expressions but this way of implementing a functional interface is verbose
public class MyClass implements MyFuncInterface{

    @Override
    public void doSomething(String a) {
        System.out.println(a);
    }
}
