package com.sd.ch8;

public class Circle extends Point{
  double radius;
  double area;
  
  public Circle(int x, int y, double r){
    super(x,y);
    radius=r;

  }

  public double getArea(){
    area=radius*radius*3.14;
    return area;

  }
 public void printArea(){
 System.out.println("Area :  "+area);
  }
  
  public static void main(String[] args){
      Circle myCircle = new Circle(10,10,5.0);
      myCircle.getArea();
      myCircle.printArea();
 
  }

}