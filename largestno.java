import java.util.*;
class Largestno
{
int a,b,c;
void largest()
{
Scanner sc =new Scanner(System.in);
System.out.println("enter a:");
a=sc.nextInt();
System.out.println("enter b:");
b=sc.nextInt();
System.out.println("enter c:");
c=sc.nextInt();
if(a>b && b>c)
{
System.out.println("largest of three is:" +a);
}
else if(b>c)
{
System.out.println("larges is:" +b);
}
else
{
System.out.println("largest is:" +c);
}
}

public static void main(String args[])
{
Largestno obj = new Largestno();
obj.largest();
}
}