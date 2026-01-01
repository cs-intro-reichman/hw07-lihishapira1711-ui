
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    public static String toBinary(int x) {
        String s = "";
        if (x==0)
        {
            return "0";
        }
        return toBinary (x,s);
    }
    public static String toBinary(int x, String s) {
        if (x==0)
           {
              return s;
           }
           if (x%2==0)
           {
         s = "0" + s;
           }
           else
           {
            s= "1" + s;
           }
        return toBinary(x/2,s);
    }    
 }
