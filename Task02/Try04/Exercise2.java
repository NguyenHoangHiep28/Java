package Try04;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        char letterCheck;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter for checking: ");
        letterCheck = input.next().charAt(0);
        switch (letterCheck){
            case 'u':
            case 'e':
            case 'o':
            case 'a':
            case 'i':
            case 'U':
            case 'E':
            case 'O':
            case 'A':
            case 'I':
                System.out.println("Letter "+ letterCheck +
                        " is a vowel.");
                break;
            default:
                System.out.println("Letter "+ letterCheck +
                        " is a consonant.");
                break;
        }
    }
}
