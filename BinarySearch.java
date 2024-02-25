import java.util.*;
public class BinarySearch {
    public static int BinarySearchMethod(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter array elements in sorted order:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter key element:");
        int key=sc.nextInt();
        System.out.println("Element found at the index: ");
        System.out.println(BinarySearchMethod(numbers, key));
        sc.close();
    }
}

