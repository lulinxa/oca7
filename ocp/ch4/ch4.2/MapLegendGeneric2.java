interface MyMap<K, V> {
	void put(K key, V value);
	V get(K key);
}
class MapLegendGeneric2<K> implements<K, String> {
	public void put(K key, String value) {}
	public String get(K key);
}
