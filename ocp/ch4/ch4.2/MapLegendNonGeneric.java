interface MyMap<K, V> {
	void put(K key, V value);
	V get(K key);
}
class MapLegendNonGeneric implements MyMap<String, Integer> {
	public void put(String s, Integer i) {}
	public Integer get(String s) { return null; }
	// this won't compile
	// public String get(String s) { return null; }
}
