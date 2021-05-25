import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pb1 {
	 public static void main(String[] args) {

	        int myArray[] = {12, 25, 47, 58, 47, 7, 96, 14, 3, 9};
	        ArrayList myNewArray = new ArrayList();

	        for (int i = 0; i < myArray.length; i++) {
	            myNewArray.add(myArray[i]);
	        }

	        Scanner scan = new Scanner(System.in);
	        System.out.println("Alegeti un numar de pe pozitia 0 sau 9: ");
	        int position = -1;
	        while (position < 0 || position > 9) {
	            while (!scan.hasNextInt()) {
	                scan.next();
	            }
	            System.out.println("Alegeti un numar de pe o pozitie intermediara: ");
	            position = scan.nextInt();
	        }
	        System.out.println("Introduceti un numar intreg: ");
	        int myInteger = scan.nextInt();

	        myNewArray.add(position, myInteger);
	        System.out.println("Utilizand ArrayList ->" + myNewArray);

	

	        int copy[] = new int[11];
	        for(int i=0; i < myArray.length; i++) {
	            copy[i] = myArray[i];
	        }

	        int n = copy.length;
	        for (int j = n-2; j >= position; j--)
	            copy[j+1] = copy[j];

	        copy[position] = myInteger;
	        myArray = copy;
	        System.out.println(Arrays.toString(copy));
	}
}
