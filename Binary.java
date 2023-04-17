import java.util.*;
class Binary
{
public static void main()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a binary");int x,y; double ans=0;
int a = sc.nextInt();int p=0;
while(a!=0)
{
x=a%10;
y=a/10;
ans=ans+(x*Math.pow(2,p));
p++;
a=y;
}System.out.println(ans);
}
}