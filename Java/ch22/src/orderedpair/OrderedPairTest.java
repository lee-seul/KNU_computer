package orderedpair;

interface Pair<K, V> {
	public K getKey();
	public V getValue();
}

class OrderedPair <K,V> implements Pair <K, V> {
	private K key;
	private V value;
	public OrderedPair(K key, V value){
		this.key = key;
		this.value = value;
	}
	public K getKey(){ return key; }
	public V getValue(){ return value; }
}

public class OrderedPairTest {

	public static void main(String[] args) {
		Pair <String, Integer> p1 = new OrderedPair<String, Integer>("Evne", 8);
		Pair <String, String> p2 = new OrderedPair<String, String>("hello", "world");
	}

}
