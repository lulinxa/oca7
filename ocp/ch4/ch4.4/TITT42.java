interface MyMap<K, V> {
	void put(K key, V value);
	V get(K key);
}
class CustomMap<K, V> implements MyMap<K,V> {
	K key;
	V value;
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public V get(K key) {
		return value;
	}
}
class TITT42 {
	public static void main(String args[]){
		CustomMap map = new CustomMap<Integer, String>();
		map.put(new String("1"), "Selvan");
		// String strVal = map.get(new Integer(1));
		Object strVal = map.get(new Integer(1));
		System.out.println(strVal);
	}
}
