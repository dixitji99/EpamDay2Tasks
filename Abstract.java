abstract class Abstract1{
    //we can create constructor of abstract class
    Abstract1()
    {
        System.out.println("Abstract1 constructor called");
    }
    //private abstract int add();it will give error The abstract methodcan only set a visibility modifier, one of public or protected
    abstract int add(int a,int b);
    int aa=5;
}
class NonAbstract extends Abstract1{
    int add(int a,int b)
    {
        return a+b;
    }
}
public class Abstract {
    public static void main(String[] args) {
        NonAbstract obj1=new NonAbstract();
        System.out.println(obj1.add(5, 6));
    }
}
