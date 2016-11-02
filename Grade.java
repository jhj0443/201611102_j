import java.util.Scanner;

class Grade{

  public static void main(String[] args){
  
    Scanner a = new Scanner(System.in);
    System.out.print("당신의 점수는 몇점인가요? : ");
    int f = a.nextInt();
  
    if(f>=90 && f<=100){
      System.out.println("당신의 학점은 A입니다"); 
    } else if(f>=80 && f<90){
      System.out.println("당신의 학점은 B입니다"); 
    } else if(f>=70 && f<80){
        System.out.println("당신의 학점은 C입니다"); 
    } else if(f>=60 && f<70){
        System.out.println("당신의 학점은 D입니다"); 
    } else{
        System.out.println("당신의 학점은 F입니다"); 
    }
  
  }

}