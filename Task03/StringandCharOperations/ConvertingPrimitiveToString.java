package StringandCharOperations;

public class ConvertingPrimitiveToString {
    public static void main(String[] args){
        /*Ways to convert primitive to String*/
        // 1. Using String concatenation operator '+' with an empty String
        String str1 = 123 + "";
        String str2 = 12.34 + "";
        String str3 = 'c' + "";
        String str4 = true + "";
        // 2. Using String.valueOf(aPrimitive)
        String str5 = String.valueOf(12345);
        String str6 = String.valueOf(true);
        String str7 = String.valueOf(55.66);
        // 3. Using toString() for each primitive type
        String str8 = Integer.toString(12345);
        String str9 = Double.toString(1.23);
        String str10 = Character.toString('z');
    }
}
