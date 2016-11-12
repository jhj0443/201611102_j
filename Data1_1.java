import java.util.ArrayList;

public class Data1_1{
  public static void main(String[] args){
    ArrayList<Integer> a= new ArrayList<Integer>();
    for(int i=0; i<1001; i++)
      if(i%4==0 && i%5!=0){
      a.add(i); 
       }
  System.out.print(a);
     
  }




}