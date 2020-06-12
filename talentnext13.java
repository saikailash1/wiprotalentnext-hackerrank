import java.util.*;

public class code{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in)
int a = sc.next();
String b = Integer.toString(a);
int n = b.length();
int path = 0;
char[] ch = new char[n];
for(int i=0;i<n;i++)
{
char[i] = b.charAt(i);
}
for(int i=0;i<n;i++)
{

if(ch[i]=='0')
{
path = path+1;
}

else if(ch[i]=='8')
{
path = path+2;
}

else if(ch[i]=='4')
{
path = path+1;
}

else if(ch[i]=='6')
{
path = path+1;
}

else if(ch[i]=='9')
{
path = path+1;
}

else
{
continue;
}
}
System.out.println(path);
}
}
