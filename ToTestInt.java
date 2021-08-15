interface Testable{
    int square(int a);
}
class Airthmatic implements Testable{
    public int square(int a){
        return a*a;
    }
}
public class ToTestInt{
    public static void main(String[] args) {
        Airthmatic obj1=new Airthmatic();
        System.out.println(obj1.square(5));
    }
}
