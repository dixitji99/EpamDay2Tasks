
interface BaseInterface{
    void meth1();
    static void meth2()
    {
        meth();//using private method from interface
        System.out.println("Method2 from Baseinterface");
    }
    private static void meth()
    {
        System.out.println("Private Method");
    }
}
interface ChildInterface{
    static void meth3()
    {
        System.out.println("Method3 from Childinterface");
    }
}
class C1{
    void meth4()
    {
        System.out.println("Method4 from class C1");
    }
}
public class MultipleInheritance extends C1 implements BaseInterface,ChildInterface {
    public void meth1()
    {
        System.out.println("Method1 declared in main class");
    }
    public static void main(String[] args) {
        MultipleInheritance obj1=new MultipleInheritance();
        obj1.meth1();
        obj1.meth4();
        //for calling static method from Interface
        ChildInterface.meth3();
        BaseInterface.meth2();
    }
    
}
