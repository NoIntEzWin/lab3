package ex2;
import java.util.Scanner;

class ex2{

public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter number:");
        int numar, suma = 0;
        numar = myObj.nextInt();
        String str = Integer.toString(numar);
        for (int i = 1; i < str.length(); i++){
            suma = suma + numar % 10;
                    numar = numar/10;
            }
        System.out.println(suma);
        }
}