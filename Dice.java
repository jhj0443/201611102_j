package com.sd.pro;
class Dice {
    private int number = 0;
    public void roll() {   
        number = (int) (Math.random() * 6 +1);
        if (number==6)
          number=-1;
        System.out.println("Turn on " + number);
    }
    public int getNum() {
        return this.number;
    }
}
