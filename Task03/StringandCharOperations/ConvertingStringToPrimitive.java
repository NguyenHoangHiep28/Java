package StringandCharOperations;

public class ConvertingStringToPrimitive {
    public static void main(String[] args){
        // String to int
        String inStr = "5566";
        int number = Integer.parseInt(inStr);
        // String to double/float
        String inStr1 = "55.66";
        float aFloat = Float.parseFloat(inStr1);
        double aDouble = Double.parseDouble("1.12345");
        aDouble = Double.parseDouble("1.2e-3");
        //String to char
        String msg = "Hello, world!";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx){
            msgChar = msg.charAt(idx);
            System.out.println(msgChar);
        }
    }
}
