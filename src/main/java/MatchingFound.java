class MatchingFound{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  MatchingFound obj=new MatchingFound();  
  obj.sum(20,20);//now int arg sum() method gets invoked  
  }  
} 
