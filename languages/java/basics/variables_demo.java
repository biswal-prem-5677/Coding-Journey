class Student
{
    int roll;
    void show()
    {
        System.out.println(roll);
    }
    public static void main(String a[])
    {
        Student s = new Student();
        s.roll=10;
        s.show();
        Student s1 = new Student();
        s1.roll=20;
        s1.show();
 
    }
}