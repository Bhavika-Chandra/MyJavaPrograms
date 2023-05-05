import java.util.*;
import java.util.Scanner;
class A {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 100:");
        int a = in.nextInt();
        for(int i=2;i<=a;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
		}
}   	  }
	  public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
        for(int i=2;i<=Math.sqrt(num);i++){
		if(num%i==0){
			return false;
		}
	  }
	 return true;
    }
}