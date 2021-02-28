package StringandCharOperations;
import java.util.Scanner;
public class ConvertingCharToInt {
    public static void main (String[] args){
        Scanner charInput = new  Scanner(System.in);
        System.out.println("Enter a char to convert: ");
        char hexChar = charInput.next().charAt(0);
        int dec;

        if (hexChar >= '0' && hexChar <= '9'){
            dec = hexChar - '0';
        } else if (hexChar >= 'A' && hexChar <= 'F'){
            dec = hexChar - 'A' + 10;
        }else {
            dec = -1;
            System.out.println("Invalid hex char");
        }
        System.out.println(hexChar + ": " + dec);
    }
}
