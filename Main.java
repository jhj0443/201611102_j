package com.sd.ch8;

public class Main{
  public static void main(String[] args){
    Selection s = new Selection();
    Rectangle r = new Rectangle(20,30);
    Cube c = new Cube(10.0,20.0,30.0);
    c.getLength();
    s.select(r);
    r.getSelected();
}

}