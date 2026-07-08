import java.util.Scanner;
import java.util.Stack;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> sob=new Stack<>();
        while(n>0){
            sob.push(n%10);
        n=n/10;
        }
        int sum=0;
        while(!sob.isEmpty()){
            sum += sob.pop();
        }
        System.out.println(sum);
    }
}