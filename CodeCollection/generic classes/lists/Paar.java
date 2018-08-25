package lists;

interface Paar<S, W> {

	/**
	 * liefert den Schluessel eines Werte-Paars<S, W>
	 * 
	 * @return schluessel
	 */
	public S liefereSchluessel();
	
	/**
	 * liefert den Wert eines Werte-Paars<S, W>
	 * 
	 * @return wert
	 */
	public W liefereWert();
	
	/**
	 * legt den Schluessel S eines Werte-Paars<S, W> fest
	 * 
	 * @param schluessel
	 */
	public void setSchluessel(S schluessel);
	
	/**
	 * legt den Wert W eines Werte-Paars<S, W> fest
	 * 
	 * @param wert
	 */
	public void setWert(W wert);
	
	/**
	 * vergleicht ein Werte-Paar<S, W> mit einem übergebenen Werte-Paar<S, W> p
	 * 
	 * @param p zu vergleichendes Wertepaar
	 * @return true, wenn S und W beider Wertepaare gleich sind,
	 * 	 		sonst false
	 */
	public boolean istGleich(Paar<S, W> p);
}
