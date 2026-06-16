import java.util.*;
public class setbit
{
    public static void main(String args[])
    {
        int a=5;
        int b=0;
        if((a&(1<<b))!=0)
        {
            System.out.println("setbit");
        }
        else{
            System.out.println("not a set bit");
        }

    }
}