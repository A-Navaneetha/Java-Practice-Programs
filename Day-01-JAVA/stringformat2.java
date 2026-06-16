import java.util.*;
public class stringformat2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt();
        System.out.println(String.format("The name of the person is %s and age is %d",a,b));
    }
    }