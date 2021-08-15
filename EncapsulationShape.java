
/*
Author: Ayush Dixit
 */

 class Shape{     
    class Circle
    {
    private int circlecount=0;
       void draw()
        {
           System.out.println("Circle Drawn Successfully");
           circlecount+=1;
        }
        void erase()
        {
           System.out.println("Circle erased Successfully");
           circlecount-=1;             
        }
        public int getCircleCount()
        {
            return circlecount;
        }
    }

    class Triangle
    {
        private int trianglecount=0; 
        void draw()
        {
           System.out.println("Triangle Drawn Successfully");
           trianglecount+=1;
        }
        void erase()
        {
           System.out.println("Triangle erased Successfully");
           trianglecount-=1;             
        }
        public int getTriangleCount()
        {
            return trianglecount;
        }
    }

    class Square
    {    
    private int squarecount=0;
       void draw()
        {
           System.out.println("Square Drawn Successfully");
           squarecount+=1;
        }
        void erase()
        {
           System.out.println("Circle erased Successfully");
           squarecount-=1;             
        }
        public int getSquareCount()
        {
            return squarecount;
        }
    }
 }

 public class EncapsulationShape{
    public static void main(String[] args) {
        Shape.Circle circle=new Shape().new Circle();
        Shape.Triangle triangle=new Shape().new Triangle();
        Shape.Square square=new Shape().new Square();      
        circle.draw();
        circle.draw();
        circle.draw();
        circle.draw();
        square.draw();
        square.draw();
        triangle.draw();
        System.out.println(circle.getCircleCount());
        //System.out.println(circle.circlecount); this will give error due to private variable circlecount
        System.out.println(triangle.getTriangleCount());
        System.out.println(square.getSquareCount());
        triangle.erase();        
        System.out.println(triangle.getTriangleCount());
    }     
 }
