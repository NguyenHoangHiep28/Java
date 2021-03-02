package Task04;

import java.util.Scanner;
public class customerCheckout {
    public static void main(String[] args){
        int shirtsQty, trousersQty;
        int shirtsPrice = 300, trousersPrice = 700;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order: ");
        shirtsQty = input.nextInt();
        System.out.println("Enter the number of Trousers to order: ");
        trousersQty = input.nextInt();
        int shirtsTotal = shirtsQty * shirtsPrice;
        int trousersTotal = trousersQty * trousersPrice;
        int total = shirtsTotal + trousersTotal;
        float discount = total > 5000 ? (float) total/100*10 :
                total > 3000 && total <= 5000 ?(float) total/100*5 :
                        0;
        System.out.println();
        System.out.println("Item          Quantity          Price          Total");
        System.out.println("_______________________________________________________________________");
        System.out.println("Shirts            "  + shirtsQty + "             "
                + shirtsPrice + "             " + shirtsTotal);
        System.out.println("Trousers          "  + trousersQty + "             "
                + trousersPrice + "             " + trousersTotal);
        System.out.printf("Discount                                        %.2f%n", discount);
        System.out.println("_______________________________________________________________________");
        System.out.printf("Net Total                                       %.2f%n", total - discount);
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("Point Earned       %.0f%n", (total - discount) / 100 * 10);
        System.out.println("Thank you!");
    }
}
