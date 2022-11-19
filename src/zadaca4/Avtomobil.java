package zadaca4;

public class Avtomobil {

	private String marka;
	private String model;
	private int km;
	private String boja; 
	
	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public String getBoja() {
		return boja;
	}


	public void setBoja(String boja) {
		this.boja = boja;
	}

	
	//dinamichen konstruktor
	public Avtomobil (String marka, String model, int km, String boja) {
		this.marka=marka;
		this.model=model;
		this.km=km;
		this.boja=boja;
	}
	
	
	public int metod (int pomnoziKm) {
		int noviKm;
		noviKm=this.km*pomnoziKm;
		return noviKm;
	}
	
}
