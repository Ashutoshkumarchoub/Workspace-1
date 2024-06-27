public class patternAss15{
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if((i==n-2||i==0)||i+j<=(n-1)/2||i-j>=(n-1)/2){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}