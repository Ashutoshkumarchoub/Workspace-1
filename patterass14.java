public class patterass14{
    public static void main(String [] args){
        int n=12;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(i-j>=(n-1)/2||j+i>=((n-2)+(n-1)/2)||i==3*n/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}