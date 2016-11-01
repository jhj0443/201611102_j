import java.util.Scanner;

public class Tem{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    
    System.out.print("화씨 몇도입니까?: ");
    
    int f = a.nextInt();
    double c = (int)(f-32)*5/9;
    System.out.println("온도 = " + c);
    
    
    Scanner b = new Scanner(System.in);
     
    System.out.print("섭씨 몇도입니까?: ");
    
    int cc = b.nextInt();
    double ff = (int)c*1.8+32;
    System.out.println("온도 = " + ff);
  
  
  
  
  }

}