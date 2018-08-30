package otherStructures;

public class MapImplem<K, V> implements Map<K, V> {
	private K key;
	private V value;
	
	public MapImplem(K key, V value) {
		this.setKey(key);
		this.setValue(value);
	}

	@Override
	public K getKey() {		
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public void setValue(V value) {
		this.value = value;
		
	}
	@Override
	public boolean isEqualTo(Map<K, V> m) {
		
		return this.isKeyEqualTo(m.getKey()) 
				&& this.isValueEqualTo(m.getValue()) ;
	}
	
	private boolean isKeyEqualTo(K otherKey) {
		//case: other key is null
		if(otherKey == null) {
			//return true
			return otherKey == null;
		}
		return this.key.equals(otherKey);
	}
	
	private boolean isValueEqualTo(V otherValue) {
		//case: other value is null
		if(otherValue == null) {
			//true
			return otherValue == null;
		}
		return this.value.equals(otherValue);
	}
	
}
