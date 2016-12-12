package com.sd.pro;

class Player {
    private String name=null;
    private int num=0;
    int n=0;
    int sum=0;

    public Player(String _name) {
        name=_name;	
    }

    public void play() {
       Dice d=new Dice();
        while(sum<21){
        d.roll();
        num = d.getNum();
        sum+=num;
        n++;
        System.out.println(name+"'s sum is "+sum);
        }
        System.out.print(name+" : ");
        System.out.print(n);
        System.out.print(" times");
        System.out.print("\n");    
}
  public int getn(){
  return this.n;
}

    public String getName() {
        return this.name;
    }
    public int getNum() {
        return this.num;
    }
}