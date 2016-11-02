import java.util.Scanner;

class Rcp{


  public static void main(String[] args){
  
    Scanner a= new Scanner(System.in);    
    System.out.print("p1 - Rock Scissor paper?! : ");
    String b = a.next();
    
    Scanner c = new Scanner(System.in);
    System.out.print("p2 - Rock Scissor paper?! : ");
    String d = c.next();    

    if (b==d){
    System.out.println("draw");
    }
    else if (b=="scissor" && d=="rock") {
    System.out.println("p1 lose and p2 win!");
    }
    else if (b=="paper" && d=="scissor") {
    System.out.println("p1 lose and p2 win!");
    }
    else if (b=="rock" && d=="paper"){
    System.out.println("p1 lose and p2 win!");
    }
    else{
    System.out.println("p2 lose and p1 win!");
  }
  }






}