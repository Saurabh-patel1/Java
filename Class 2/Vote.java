public class Vote
{
public static void main (String[] args)
{
System.out.println(args[0]);

int a=Integer.parseInt(args[0]);
//int c=args[0];
if (a>=18){
System.out.println("You are eligible to vote");
}
else{
System.out.println("You are not eligible to vote");
}}
}