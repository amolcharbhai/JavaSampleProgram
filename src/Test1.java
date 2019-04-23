public class Test1 {
int i;
int j;
public static void main(String[] args) {
Test1 t1 = new Test1();
t1.i=200;
t1.j=100;
add(t1);
System.out.print(t1.i);
System.out.print(t1.j);
}

public static void add(Test1 t) {
t.i=t.i+100;
t.j=t.j+100;
System.out.print(t.i);
System.out.print(t.j);

}

}

