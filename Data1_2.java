import java.util.ArrayList;

public class Data1_3{

//public static ArrayList list()

public static void main(String[] args){
  System.out.print(sumList());   
     }
            
public static int sumList(){
    ArrayList<Integer> a= new ArrayList<Integer>();
   for(int i=0; i<1001; i++){
     if(i%4==0 && i%5!=0){
       a.add(i);
     }
   }
  int sum=0;
  for(int k=0; k<a.size(); k++){
     sum+=a.get(k);
     }
	return sum;
    } 
}