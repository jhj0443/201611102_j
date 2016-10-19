package com.draw2;
import ch.aplu.turtle.*;

public class p1_TurtleTriangle{
  static Turtle t1=new Turtle();
  public p1_TurtleTriangle(){};
  public static void draw(int size){
    for (int i=0; i<3; i++)  {
      t1.forward(size);
      t1.right(120);
      }
    }
      public static void main (String[] args){
      drawTriangle(100);
      }
    }