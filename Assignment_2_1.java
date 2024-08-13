import java.util.*;
public class Assignment_2_1{
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=scan.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter the element of an array :");
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        System.out.println("Duplicate element is :");
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                
                if (ar[i]==ar[j]) {
                    System.out.println(ar[j]);
                    break;
                }
            }
        }
    }
}       