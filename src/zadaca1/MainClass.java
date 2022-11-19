package zadaca1;

public class MainClass {

	public static void main(String[] args) {
		Covek covek1 = new Covek();
		
		covek1.setIme("Angela");
		covek1.setPrezime("Kjosevska");
		covek1.setEmbg("1407202020202");
		
		System.out.println(covek1.getIme());
		System.out.println(covek1.getPrezime());
		System.out.println(covek1.getEmbg());
	}

}
