abstract class Test{
public void display(){
System.out.println("I am Concrete Method");
}
abstract void show();
}
class TestAbstract extends Test{
void show(){
System.out.println("I am Show Method with body");
}
public static void main(String arg[]){
TestAbstract ob = new TestAbstract();
ob.show();
ob.display();
Test r = new TestAbstract();
r.display();
r.show();
}}