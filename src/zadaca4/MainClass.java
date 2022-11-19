package zadaca4;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil a = new Avtomobil("Opel", "Astra", 9,"crvena");
		
		System.out.println(a.getMarka()+" "+ a.getModel()+" "+ a.getKm()+" "+a.getBoja());
		System.out.println("Novi kilometri po metodot: "+a.metod(3));
		
	}

}
