package lists;

public class PaarImplem<S, W> implements Paar<S, W> {
	private S schluessel;
	private W wert;
	
	public PaarImplem(S schluessel, W wert) {
		this.setSchluessel(schluessel);
		this.setWert(wert);
	}

	@Override
	public S liefereSchluessel() {		
		return this.schluessel;
	}
	@Override
	public W liefereWert() {
		return this.wert;
	}
	@Override
	public void setSchluessel(S schluessel) {
		this.schluessel = schluessel;
	}
	@Override
	public void setWert(W wert) {
		this.wert = wert;
		
	}
	@Override
	public boolean istGleich(Paar<S, W> p) {
		
		return this.istSchluesselGleich(p.liefereSchluessel()) 
				&& this.istWertGleich(p.liefereWert()) ;
	}
	
	private boolean istSchluesselGleich(S andererSchluessel) {
		if(andererSchluessel == null) {
			return andererSchluessel == null;
		}
		return this.schluessel.equals(andererSchluessel);
	}
	
	private boolean istWertGleich(W andererWert) {
		if(andererWert == null) {
			return andererWert == null;
		}
		return this.wert.equals(andererWert);
	}
	
}
