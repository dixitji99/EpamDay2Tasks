class Outer{
    void display()
    {
        System.out.println("Display from Outer Class");
    }
    class Inner{
        void display()
        {
            System.out.println("Display from Inner Class");
        }

    }
}
public class InnerOuterClass {
    public static void main(String[] args) {
        Outer obj1=new Outer();
        Outer.Inner obj2=obj1.new Inner();
        obj1.display();
        obj2.display();
    }
    
}
