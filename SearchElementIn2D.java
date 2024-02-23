import java.util.Scanner;

public class SearchElementIn2D{
    public static void Search(int arr[][],int key){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    found=true;
                    break;
                }
            }
        }
        if (found){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not found");
        }   
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n=sc.nextInt();
        System.out.println("Enter no of columns: ");
        int m=sc.nextInt();
        System.out.println("Enter the matrix: ");
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the key element: ");
        int key=sc.nextInt();
        Search(arr, key);
        sc.close();
    }
}