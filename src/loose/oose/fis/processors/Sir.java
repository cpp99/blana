
public class Sir extends Tip {

	protected String cuvant;
	
	public Sir(String s) {
		cuvant=s;
	}
	
	@Override
	public String getTip() {
		return "Tip: Sir";
	}
	
	public String getCuvant() {
		return this.cuvant;
	}

	@Override
	public String toString() {
		return this.getCuvant();
	}

}
