public class Pattern
{
public static void main (String[] args)
{
int a,b,c;
for (a=1,a<=5,a++)
{
for (b=1,b<=a,++b)
System.out.println(b);

for (c=5-a,c>=1,c--)
System.out.println(c);
}
}
}