import java.util.Scanner;

public class StartPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int n = Integer.parseInt(str);

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=0;j<=2*i;j++) System.out.print("*");

            System.out.println();
        }
    }
}
