import java.util.Scanner; 

public class PrintPattern2{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int size = in.nextInt();
    for (int i=1; i<=size; i++){
        for (int row =i; row<= size; row++){
            // for (int col=row; col <=size; col++){
            //     System.out.print(col);
            // }
            for (int col=row+1; col >=i; col--){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
    }
}