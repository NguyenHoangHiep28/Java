package Java1_11;

public class TestInvoiceItem {
    public static void main(String[] args){
        InvoiceItem item1 = new InvoiceItem("I01", "new", 3, 25.3);
        System.out.println("Item ID: " + item1.getID());
        System.out.println("Item describe: " + item1.getDesc());
        System.out.println("Item quantity: " + item1.getQty());
        System.out.println("Item unit price: " + item1.getUnitPrice());
        System.out.println("Total price: " + item1.getTotal());
        System.out.println(item1.toString());
        System.out.println("\n--------------------------------\n");
        item1.setQty(5);
        item1.setUnitPrice(35.2);
        //after called setQty() and setUnitPrice() methods
        System.out.println("Item quantity: " + item1.getQty());
        System.out.println("Item unit price: " + item1.getUnitPrice());
        System.out.println("Total price: " + item1.getTotal());
        System.out.println(item1.toString());
    }
}
