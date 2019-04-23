public class Test {
static int x=0;
String name;
boolean b;

public static void main(String[] args) {
Test t1= new Test();
x=x+10;
t1.start();

}

public void start() {
x++;
System.out.println(x);
}
}