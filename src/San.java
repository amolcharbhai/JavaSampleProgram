public class San
{
public void m1 (String i,int f)
{
System.out.print(i+f);
}

public void m1(int f,String i)
{
System.out.print(i+f);
}

public static void main(String[]args)
{
San s=new San();
s.m1("A", 1);
s.m1(2, "B");
}
}