import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Reading {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int intNum = 0;
        float floatNum = 0.0f;
        
        try 
        {   
            System.out.println("Enter a String : ");
            String input = br.readLine();//read the line of text as a String.

            System.out.println("Enter an Integer: ");
            intNum = Integer.parseInt(br.readLine());
            
            System.out.println("Enter a Float: ");
            floatNum = Float.parseFloat(br.readLine());
        } 
        catch (IOException ioe) //Handle the IOException if thrown by readLine() function.
        { 
            System.out.println("Input Error: " + ioe);
        } 
        try {
            br.close();
        } catch (IOException e) {
        System.out.println("Error closing BufferedReader: " + e);
        }
        System.out.println("input : " + input);
        System.out.println("intNum : " + intNum);
        System.out.println("floatNum : " + floatNum);
    }
}
