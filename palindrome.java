import java.util.*;
class palindrome{
    public static void main(String args[]){
        String rString = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String pString=in.nextLine();
        int length=pString.length();
        for(int i=length-1;i>=0;i--){
             rString = rString + pString.charAt(i);
        }
        if(pString.equals(rString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}