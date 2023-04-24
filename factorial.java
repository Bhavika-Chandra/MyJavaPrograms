//import java.util.*;
class factorial{  
 public static void main(String args[]){  
  int i,fact=1; 
  int n=5; 
  //System.out.println("Enter a number:");
  //int n = scn.nextInt();  
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}  