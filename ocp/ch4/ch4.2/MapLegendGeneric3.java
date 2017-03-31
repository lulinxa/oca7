interface MyMap<K, V> {
	void put(K key, V value);
	V get(K key);
}
class MapLegendGeneric3<V> implements MyMap<String, V> {
	public void put(String key, V value) {}
	public V get(String key) { return null; }
}
