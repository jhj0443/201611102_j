package com.draw3;
import ch.aplu.turtle.*;

public class p1_TurtleDraw{
static Turtle t1=new Turtle();
enum Shape{TRIANGLE, SQUARE}
  public p1_TurtleDraw(){};
  public static void drawSquare(int size){
    for (int i=0; i<4; i++)  {
      t1.forward(size);
      t1.right(90);
      }
}
  public static void drawTriangle(int size){
    for (int i=0; i<3; i++)  {
      t1.forward(size);
      t1.right(120);
      }	  
    }
      public static void main (String[] args){
	  
	  Shape shape;
	  shape=Shape.SQUARE;
	  switch (shape) {
	    case TRIANGLE : drawTriangle(100); break;
	    case SQUARE : drawSquare(100); break;
	  }      
	  }  
    }