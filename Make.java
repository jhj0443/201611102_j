import ch.aplu.turtle.*;

class Make{
  public static void makeit(int size, int bigger, int turns, double degree){
      Turtle t1= new Turtle();
      for(int i=0; i<turns;  i++){
      if(i%2!=0){
      size+=bigger;
      }
      t1.forward(size);
      t1.right(degree);
      }
    }
    
  public static void main(String[] args){
    makeit(20,20,20,90);
    }

}