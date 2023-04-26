import java.util.*;
public class transpose {
    public static void main(String args[]){
        int i,j;
        System.out.println("Enter rows and columns:");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Transpose of the matrix is:");
        for(i=0;i<column;i++){
            for(j=0;j<row;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
