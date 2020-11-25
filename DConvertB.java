//Name:Arooj Amin
//id:093
import java.util.Scanner;
public class DConvertB
{
    public static void main(String[] args) 
    {
        int n;
        String x;
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter any decimal number:");
        n = s.nextInt();
        DConvertB obj = new DConvertB();
        x = obj.binary(n);
        System.out.println("Your Binary number are:"+x);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";
    }
}