import java.util.Scanner;
public class test{

    public static void main(String args[]){
        
        Scanner aScanner = new Scanner(System.in);
        String a;

        System.out.println("input");
        a=aScanner.nextLine();
        System.out.println("output"+a);

        aScanner.close();

    }
}