
public class pb3 {
	public static void main(String[] args) {
		
		Adress ad1 = new Adress("Infratirii", "Ploiesti", 7);
		PaymentMethod pay1 = new PaymentMethod("Card");
		Customer c1 = new Customer("Rusu", "Alexandra", ad1, pay1, 25, pay1);

		System.out.println( "Nume si prenume: " + c1.getCompleteName());
		System.out.println("Adresa: " + c1.getAdress().getFullAdress());
		System.out.println("Metoda de plata: " + c1.getPayMethod().getType());
	}
}
