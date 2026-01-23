class Test{
    static int i=10;
    void show()
    {
        System.out.println(i);
    }
    public static void main(String a[]){
        System.out.println(Test.i);
        System.out.println(i);
        Test t=new Test();
        t.show();
        System.out.println(t.i);
    }
}
