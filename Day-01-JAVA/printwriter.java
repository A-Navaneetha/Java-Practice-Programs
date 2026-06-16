import java.io.PrintWriter;
public class printwriter {
    public static void main(String args[])
    {
        java.io.PrintWriter pw=new PrintWriter(System.out);
        pw.println("Hello world!");
        pw.print("This is a");
        pw.print("print statement");
        pw.close();
    }
    
}
