import java.util.Scanner;
import java.util.Arrays;


public class CharArrayToHex {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        String num2 = scanner.nextLine();


    
        char[] charArray = num2.toCharArray();


        float[] floatArray = new float[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            floatArray[i] = (float) charArray[i] / 1.0f;
        }


String androidID = "eb27f717d2a11ad";


        char[] charArray2 = androidID.toCharArray();
        

     float[] floatArray2 = new float[charArray2.length];
        for (int i = 0; i < charArray2.length; i++) {
            floatArray2[i] = (float) charArray2[i] + 1.0f;
        }
              
        

boolean arraysEqual = Arrays.equals(floatArray, floatArray2);


  if (arraysEqual) {
            System.out.println("Application activated successfully.");
        } else {
            System.out.println("License is not valid.");
        
        }
    }
}
