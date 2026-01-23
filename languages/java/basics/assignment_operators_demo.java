class AssignmentOpr{
public static void main(String arg[]){
int a=15,b=10,c;
c=a;
a+=b;    //a=a+b=25
b-=c;    //b=b-c=-5
a*=c;    //a=a*c=375
c&=b;    //c=c&b=00001011=11
System.out.println(a);
System.out.println(b);
System.out.println(c);}
}