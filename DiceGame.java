package com.sd.dice;
class player{
}
class Player {
    private String name=null;
    private int num=0;
    public Player(String _name) {
        name=_name;
    }
    public void play() {
        Dice d=new Dice();
        //num=d.roll();
        d.roll();
        this.num=d.getNum();
    }
    public String getName() {
        return this.name;
    }
    public int getNum() {
        return this.num;
    }
}
class DiceGame {
    Player p1;
    Player p2;
    public void startGame() {
        Player p1 = new Player("A");
        Player p2 = new Player("B");
        p1.play();
        p2.play();
        if (p1.getNum() > p2.getNum()) {
            System.out.println(p1.getName() + " won");
        }
        else if (p1.getNum() == p2.getNum()) {
            System.out.println(" draw");
        }
        else
            System.out.println(p2.getName() + " won");
    }
}