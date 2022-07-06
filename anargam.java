import java.util.*;

class anargam
{
    public static void main(String args[])
    {
        String a = "tea";
        String b= "ate";

        char aa[] = b.toCharArray();
        Arrays.sort(aa);
        b= new String(aa);
        
        if(b.equals(new String(a))) System.out.println("true");
        else System.out.println("false");
    }
}