import java.util.*;
public class evenorodd {
    public static void main(String args[])
{
    int n=8;
    if((n&1)==0)
    {
        System.out.print(String.format("%d is a even number",n));
    }
    else
    {
        System.out.println(String.format("%d is a odd number",n));
    }
}    
}
