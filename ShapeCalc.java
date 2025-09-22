import java.util.*;
abstract class Shape{
  int a,b;
  abstract void printArea();
}
class Rectangle extends Shape{
 Rectangle (int x,int y){
   a=x;
   b=y;
 } 
 void printArea(){
  System.out.println("Area of Rectangle:"+(a*b));
  }
}
class Triangle extends Shape{
 Triangle (int x,int y){
   a=x;
   b=y;
 }                                                                                            
 void printArea(){
  System.out.println("Area of Triangle:"+(0.5*a*b));
  }
}
class Circle extends Shape{
 Circle (int r){
   a=r;
 }
 void printArea(){
  System.out.println("Area of Circle:"+(3.14*a*a));
  }
}
public class ShapeCalc{
 public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  Shape s;
  System.out.println("Enter length and Breadth:");
  int l=sc.nextInt();
  int b=sc.nextInt();
  s=new Rectangle(l,b);
  s.printArea();
  System.out.println("Enter base and Height:");
  int base=sc.nextInt();
  int h=sc.nextInt();
  s=new Triangle(base,h);
  s.printArea();
  System.out.println("Enter radius:");
  int r=sc.nextInt();
  s=new Circle(r);
  s.printArea();
  sc.close();
  }
}





