import java.util.Scanner;
public class pb1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.println("Tipul de drum:");
		String var = x.next();
		System.out.println("Viteza maxima admisa pentru varianta1 - " + tip1(var));
		System.out.println("Viteza maxima admisa pentru varianta2 - " + tip2(var));
		System.out.println("Viteza maxima admisa pentru varianta3 - " + tip3(var));
	}

	public static int tip1(String name) {
		if (name.equals("oras")) {
			return 50;
		} else {
			if (name.equals("zona_rezidentiala")) {
				return 30;
			} else {
				if (name.equals("drum_express")) {
					return 100;
				} else {
					if (name.equals("autostrada")) {
						return 130;
					} else {
						return 0;
					}
				}
			}
		}
	}

	public static int tip2(String name) {

		switch (name) {
		case "oras":
			return 50;
		case "zona_rezidentiala":
			return 30;
		case "drum_express":
			return 100;
		case "autostrada":
			return 130;
		}
		return 0;
	}

	public static int tip3(String name) {
		if (name.equals("oras")) {
			return 50;
		}
		if (name.equals("zona_rezidentiala")) {
			return 30;
		}
		if (name.equals("drum_express")) {
			return 100;
		}
		if (name.equals("autostrada")) {
			return 130;
		}

		return 0;
	}

}

