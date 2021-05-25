import java.util.Scanner;

public class pb3 {
	   public static int binarySearch(int[] sir, int number) {
	        boolean a = false;
	        int position = -1;
	        int minIndex = 0, maxIndex = sir.length - 1;
	        while (minIndex <= maxIndex) {
	            int midIndex = (minIndex + maxIndex) / 2;
	            if (sir[midIndex] == number) {
	                a = true;
	                position = midIndex;
	                break;
	            }
	            if (sir[midIndex] > number)
	                maxIndex = midIndex - 1;
	            if (sir[midIndex] < number)
	                minIndex = midIndex + 1;
	        }
	        
	        if (a == true) {
	            System.out.println("Indexul numarului " + String.format("%s", number) + " este " + position);
	        } else {
	            System.out.println("Numarul " + String.format("%s", number) + " nu a fost gasit" +
	                    "");
	        }
	        return -1;
	    }
	   public static void main(String args[])
	    {
	    	
	    	Scanner read = new Scanner(System.in);
	        int arr[] = {12, 25, 47, 58, 49, 7, 96, 14, 3, 9};
	        
	        System.out.println("Introduceti numarul pe care doriti sa il cautati: ");
	        int x = read.nextInt();
	        int rezultat =  binarySearch(arr, x);
	        
	       
	        
	        read.close();
	    }

}
