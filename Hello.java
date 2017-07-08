import java.io.Console;
import java.util.Scanner;

/**
 * Created by CrazyFlower on 2017/7/7.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        int age = in.nextInt();
        in.nextLine();
        Console cons = System.console();
        if (cons != null) {

            String userName = cons.readLine("Your name: ");
            char[] passwd = cons.readPassword("Your password: ");
        } else {

            System.out.println("You are " + name + ", " + age + "years old.");
        }
        double x = 1000 / 3;
        System.out.println(x);
    }
}
