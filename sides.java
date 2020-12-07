abstract class Shape{
    abstract void noofsides();
}
class Rectangle extends Shape{
    void noofsides(){
        System.out.println("No of sides of a Rectangle:4");
    }
}
class Triangle extends Shape{
    void noofsides(){
        System.out.println("No of sides of a Triangle:3");
    }
}
class Hexagon extends Shape{
    void noofsides(){
        System.out.println("No of sides of Hexagon:6");
    }
}
class Sides{
    public static void main(String args[])
    Shape s=new Shape;
    s=new Rectangle;
    s.noofsides();
    s=new Triangle;
    s.noofsides();
    s=new Hexagon;
    s.noofsides();
}

