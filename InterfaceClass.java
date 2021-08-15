interface A{
   public void meth1();
   static float meth2(float a,float b){
       return a+b;
   };
}
public class InterfaceClass implements A {
    public void meth1()
    {
        System.out.println("Method1 Called");
    }
    public static void main(String[] args) {
        InterfaceClass obj1=new InterfaceClass();
        obj1.meth1();
        System.out.println(A.meth2(5, 3));
    }
    
}
