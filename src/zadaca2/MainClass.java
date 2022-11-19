package zadaca2;

public class MainClass {

	public static void main(String[] args) {
		Restoran r= new Restoran();
		
		r.setIme("Korzo");
		r.setLokacija("Sirok Sokak");
		r.setTelefon("072 352 352");
		r.setSedishta(200);

		System.out.println("Restoran: "+ r.getIme());
		System.out.println("Lokacija: "+ r.getLokacija());
		System.out.println(r.getTelefon());
		System.out.println(r.getSedishta());
	}

}
