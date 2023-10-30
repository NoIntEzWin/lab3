package ex1;
import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }

    public static void
    printMiddleCharacter(String str)
    {
        int len = str.length();
        int middle = len / 2;
        System.out.println(str.charAt(middle));
    }
}