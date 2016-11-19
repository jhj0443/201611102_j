import java.util.ArrayList;
import java.util.Collections;


class Student{

   String name;
  int studentNum;
    Student(String name,int sNum){
    this.name = name;
    this.studentNum=sNum;
    }

  public String getName(){
    return name;
  }

  public static void main(String[] args){
 
    ArrayList<String> studentNameList = new ArrayList<String>();
    Student s1= new Student("zzz",1);
    Student s2= new Student("fff",2);
    Student s3= new Student("bbbbb",3);
  
    studentNameList.add(s1.getName());
    studentNameList.add(s2.getName());  
    studentNameList.add(s3.getName());

    System.out.print("Before"+studentNameList);  

    Collections.sort(studentNameList);
    
    System.out.print("  After"+studentNameList);  
  }


}