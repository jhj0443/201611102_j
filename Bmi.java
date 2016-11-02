import java.util.Scanner;

class Bmi{

  public static void main(String[] args){
  
  Scanner a = new Scanner(System.in);  
  System.out.print("몸무게 몇이에요? : ");
  float w = a.nextInt();
  
  Scanner b = new Scanner(System.in);
  System.out.print("키 몇이에요? 입력해주세요: ");
  float h = b.nextFloat();
       
  float bmi = w/h/h;
  System.out.println(bmi);
  
  if(bmi<=18.5){
  System.out.print("low");
  }
  else if(18.5<=bmi && bmi<23){
  System.out.print("normal");
  }
  else if(23<=bmi && bmi<25){
  System.out.print("risky");
  }
  else if(25<=bmi && bmi<30){
  System.out.print("obesity 1");
  }
  else if(30<=bmi && bmi<40){
  System.out.print("obesity 2");
  }
  else if(bmi>40){
  System.out.print("obsetiy 3");
  }
  else{
  System.out.print("Error");
  }
}
}