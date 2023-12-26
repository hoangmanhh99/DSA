import java.util.Scanner;

public class App {

    static void newFunc() {
        String varA = "Hello";
        String varB = "World 12";
        System.out.println(varA + " " + varB);
    }

    public static void main(String[] args) throws Exception {
        // Lesson 1
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(input.nextLine());
        }

        // Lesson 2
        String res = "Hello World";
        System.out.println(res);

        // Lesson 3
        String varA = "Hello";
        String varB = "World";
        System.out.println(varA + " " + varB);

        newFunc();
    }

}
