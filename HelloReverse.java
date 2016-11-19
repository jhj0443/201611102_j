class HelloReverse{

  public static void main(String[] args){
  String H="Hello";
  char[] chArr = H.toCharArray();
  
  StringBuilder R = new StringBuilder();
  
  for(int i=chArr.length-1; i>=0; i--){
  R.append(chArr[i]);
  }
  System.out.print(R);
  }

}