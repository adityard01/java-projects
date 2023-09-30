import java.util.Scanner;

public class GetInputScanner {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int product = firstNumber*secondNumber;
        System.out.println("Did you know that " + firstNumber + " times " + secondNumber + " is " + product);

        String goTo = "GoTo";
        System.out.println(goTo);
    }
}

//this is comment
//this is also comment
//this is another comment

/**this is comment for documentation,
 * in IntellijIDEA the color is different from ordinary double slash comment
 */

