interface MyMap<K, V> {
	void put(K key, V value);
	V get(K key);
}
class MapLegendGeneric<K, V> implements MyMap<K, V> {
	public void put(K key, V value) {}
	public V get(K key) { return null; }
}

