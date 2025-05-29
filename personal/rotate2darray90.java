import java.util.Scanner;

public class rotate2darray90 {
public static void main(String[]args){
   // 2d array creation
    Scanner sc= new Scanner(System.in);
    System.out.println("enter no. of rows");
    int rows=sc.nextInt();
    System.out.println("enter no. of cols");
    int cols=sc.nextInt();
    int[][]arr=new int[rows][cols];
    for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    //transpose
    for(int i=0;i<rows;i++){
        for(int j=0;j<i;j++){
            int temp =arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }


    for(int i = 0; i < rows; i++){
        int j = 0;
        int k = cols - 1;
        while(j < k){
            int temp = arr[i][j];
            arr[i][j] = arr[i][k];
            arr[i][k] = temp;
            j++;
            k--;
        }
    }


    for(int a=0;a<rows;a++){
        for (int b=0;b<cols;b++){
            System.out.print(arr[a][b]+" ");

        }
        System.out.println();
    }


}
}
