import java.io.*;
public class MarksOutOfBounds extends Exception {
    public void showError(){
        System.out.println("Invalid marks");
    }
}
class errorTest{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int m;
        try{
            System.out.println("Enter marks:");
            m = Integer.parseInt(br.readLine());
            if(m>100){
                throw new MarksOutOfBounds();
            }
            System.out.println("Your marks:"+m);
        }
        catch(MarksOutOfBounds e){
            e.showError();
        }
    }
}
