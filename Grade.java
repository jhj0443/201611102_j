import java.util.Scanner;

class Grade{

  public static void main(String[] args){
  
    Scanner a = new Scanner(System.in);
    System.out.print("����� ������ �����ΰ���? : ");
    int f = a.nextInt();
  
    if(f>=90 && f<=100){
      System.out.println("����� ������ A�Դϴ�"); 
    } else if(f>=80 && f<90){
      System.out.println("����� ������ B�Դϴ�"); 
    } else if(f>=70 && f<80){
        System.out.println("����� ������ C�Դϴ�"); 
    } else if(f>=60 && f<70){
        System.out.println("����� ������ D�Դϴ�"); 
    } else{
        System.out.println("����� ������ F�Դϴ�"); 
    }
  
  }

}