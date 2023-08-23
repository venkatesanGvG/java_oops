import java.util.Scanner;

public class matrixjava{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int transpose[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[i][j]=sc.nextInt();
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(transpose[j][i]+" ");
            }
            System.out.println();
        }
    }}