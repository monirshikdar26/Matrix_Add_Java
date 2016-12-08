import java.util.Scanner;
import java.util.Arrays;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);

System.out.print("Enter the row size of array: ");
int row = input.nextInt();
System.out.print("Enter the coloumn size of array: ");
int coloumn = input.nextInt();

int [][]A = new int[row][coloumn];
int [][]B = new int[row][coloumn];
int [][]C = new int[row][coloumn];
 
System.out.println("Enter the element of matrix A (3 x 3): ");
for(int i=0;i<A.length;i++)
{
for(int j=0;j<A.length;j++)
{
A[i][j] = input.nextInt();
}
}

System.out.println(Arrays.deepToString(A));

System.out.println("Enter the element of matrix B (3 x 3): ");

for(int i=0;i<B.length;i++)
{
for(int j=0;j<B.length;j++)
{
B[i][j] = input.nextInt();
}
}

for(int []i:B){
System.out.println(Arrays.toString(i));
}

for(int i=0;i<C.length;i++)
{
for(int j=0;j<C.length;j++)
{
C[i][j] = A[i][j] + B[i][j];
}
}

System.out.println("Addition of matrix is : ");
for(int[] k:C)
{
System.out.println(Arrays.toString(k));
}

}
}

