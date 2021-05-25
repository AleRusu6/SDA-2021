import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        StudentDetails student1 = new StudentDetails("Alexandra", "Rusu", 8, 8);
        StudentDetails student2 = new StudentDetails("Ana", "Radu", 7, 10);
        StudentDetails student3 = new StudentDetails("Mihai", "Cruceru", 10, 10);
        StudentDetails student4 = new StudentDetails("Cristian", "Anton", 9, 8);
        StudentDetails student5 = new StudentDetails("Ioana", "Nicolae", 9, 8);
        StudentDetails student6 = new StudentDetails("Razvan", "Mihai", 4, 5.5);
        StudentDetails student7 = new StudentDetails("Teodora", "Grama", 9, 5);
        StudentDetails student8 = new StudentDetails("Cristina", "Popa", 3, 10);
        StudentDetails student9 = new StudentDetails("Vali", "Radu", 7.5, 5);
        StudentDetails student10 = new StudentDetails("Bianca", "Popescu", 10, 8);

        // HashMap
        HashMap<String, StudentDetails> studentList_HashMap = new HashMap<>();

        studentList_HashMap.put("1", student1);
        studentList_HashMap.put("2", student2);
        studentList_HashMap.put("3", student3);
        studentList_HashMap.put("4", student4);
        studentList_HashMap.put("5", student5);
        studentList_HashMap.put("6", student6);
        studentList_HashMap.put("7", student7);
        studentList_HashMap.put("8", student8);
        studentList_HashMap.put("9", student9);
        studentList_HashMap.put("10", student10);

        // LinkedHashMap
        LinkedHashMap<String, StudentDetails> studentList_LinkedHashMap = new LinkedHashMap<>();

        studentList_LinkedHashMap.put("1", student1);
        studentList_LinkedHashMap.put("2", student2);
        studentList_LinkedHashMap.put("3", student3);
        studentList_LinkedHashMap.put("4", student4);
        studentList_LinkedHashMap.put("5", student5);
        studentList_LinkedHashMap.put("6", student6);
        studentList_LinkedHashMap.put("7", student7);
        studentList_LinkedHashMap.put("8", student8);
        studentList_LinkedHashMap.put("9", student9);
        studentList_LinkedHashMap.put("10", student10);

        // insert a CNP (ID) to search
        Scanner scan = new Scanner(System.in);
        String CNP = scan.nextLine();

        //HashMap output
        System.out.println(studentList_HashMap.get(CNP));

        for (String key : studentList_HashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        //LinkedHashMap output
        System.out.println(studentList_LinkedHashMap.get(CNP));

        for (String key : studentList_LinkedHashMap.keySet()) {
            System.out.println(key);
        }

        scan.close();

    }
}

 