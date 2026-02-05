import java.util.Scanner; 

public class PrintPattern1{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int size = in.nextInt();
    // Outer loop to print each of the rows
    for (int row = 1; row <= size; row++) {
    // Inner loop to print each of the columns of a particular row
        for (int col = 1; col <= size; col++) {
            System.out.print("# ");
        }
    System.out.println("");
    }
}