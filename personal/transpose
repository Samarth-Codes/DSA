import java.util.Scanner;

public class transpose {

    public static void main(String[] args){
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
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }




    }
}

