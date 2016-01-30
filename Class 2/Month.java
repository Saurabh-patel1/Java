class Month
{
public static void main(String args[])
{
	System.out.println(args[0]);
//int month=args[0];
	
//char month=char.parseChar(args[0]);
String month=args[0];
int b=31,c=30,d=28;
switch(month)
{
case "January":
System.out.println(b);
break;
case "Febuary":System.out.println(d);break;
case "March":System.out.println(b);break;
case "April":System.out.println(c);break;
case "May":System.out.println(b);break;
case "June":System.out.println(c);break;
case "July":System.out.println(b);break;
case "August":System.out.println(b);break;
case "September":System.out.println(c);break;
case "October":System.out.println(b);break;
case "November":System.out.println(c);break;
case "December":System.out.println(b);break;
default:System.out.println("Not a valid month");break;

}}}