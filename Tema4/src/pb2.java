import java.util.Arrays;
import java.util.Scanner;

public class pb2 {
	public static void main(String[] args) {
      

        int myArray[] = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};

        Scanner scan = new Scanner(System.in);
        int position = -1;
        System.out.println("Alegeti pozitia 0 sau 9: ");
        while (position < 0 || position > 9) {
            while(!scan.hasNextInt()) {
                scan.next();
            }
            System.out.println("Alegeti o pozitie intermediara: ");
            position = scan.nextInt();
        }

        int n = myArray.length-1;
        for (int i = position; i < n; i++) {
            myArray[i] = myArray[i+1];
        }

        myArray[n] = 0;
        System.out.println(Arrays.toString(myArray));

    }
}
