package com.sd.pro;
import java.awt.*;
import java.awt.event.*;

public class Ch extends Frame {
 Label label;
 Button button;
 public Ch(){
  button = new Button("click please");
  label = new Label("Noting");
  this.setLayout(new FlowLayout());
  this.add(button);
  this.add(label);
  setSize(300,100);
  setVisible(true);
  button.addActionListener(new EventAction());
 }
 
 
 class EventAction implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   label.setText("click");
   
    Game2 pg = new Game2();
    pg.startGame();

  
   
  }
 }
}


