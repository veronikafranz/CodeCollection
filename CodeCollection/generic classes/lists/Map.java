package lists;

/**
 * An interface that specifies the relation between two elements, 
 * a key element and an other object or element.
 * Each key can only be used once, i. e. refer to one element.
 * 
 * @author veron
 *
 * @param <S>
 * @param <W>
 */
interface Map<K, V> {

	/**
	 * Returns S, the key of a pair<S, W>
	 * 
	 * @return key
	 */
	public K getKey();
	
	/**
	 * Returns W, the value of a pair<S, W>
	 * 
	 * @return value
	 */
	public V getValue();
	
	/**
	 * Specifies the S, the key of a pair<S, W>
	 * 
	 * @param key
	 */
	public void setSchluessel(K key);
	
	/**
	 * Specifies W, the value of a pair<S, W>
	 * 
	 * @param value
	 */
	public void setValue (V value);
	
	/**
	 * compares a pair<S, W> with a specified pair<S, W> m
	 * 
	 * @param p specified pair
	 * @return true, if S and W of both pairs are the same,
	 * 	 		else false
	 */
	public boolean isEqualTo(Map<K, V> m);
}
