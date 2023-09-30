import java.util.ArrayList;

public class LearnJava {
    /*
     *  get from static method from same class
     */
//    public static void main(String... args) {
//        String output = addExclamationMark("Hello Kampret ");
//        System.out.println(output);
//    }
//    public static String addExclamationMark(String s) {
//        return s + "!";
//    }

    /*get from another class*/
    public static void main(String[] args) {
        Human humanObject = new Human();
        String humanString = humanObject.iAmHuman();
        System.out.println(humanString);
    }
}
