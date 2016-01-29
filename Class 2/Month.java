class Month
{
public static void main(String[] args)
{
	System.out.println(args[0]);
int month=args[0];
	
//char month=char.parseChar(args[0]);

int b=31,c=30,d=28;
switch(month)
{
case 'J':
System.out.println(b);
break;
//case "Febuary":System.out.println(d);break;
default:System.out.println("Not a valid month");

}}}