package com.sd.pro;

class Game2 {
    Player p1;
    Player p2;
    int sum=0;
    public void startGame() {
        Player p1 = new Player("A");
        Player p2 = new Player("B");
        p1.play();
        p2.play();
        if (p1.getn()==p2.getn()){
      	System.out.print("draw \n");
	} else if (p1.getn()>p2.getn()){
	System.out.print("B wins \n");
	} else
  	System.out.print("A wins\n");
        }
}