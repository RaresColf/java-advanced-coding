package ro.sdacdemy.advanced;

// java-jar.\jar-module-1.0-SNAPSHOT.jar argument 1 argument 2 argument 3
// java -DmyProperty=Messi -jar.\jar-module-1.0-SNAPSHOT.JAR argument 1

public class Main {
    private static int counter = 0;
    public static void main(String[] args) {
        for(String arg : args){
            System.out.println("argument number " + counter + " is " + arg );
            counter++;
        }

        System.out.println("system property: " + System.getProperty("myProperty"));
    }
}