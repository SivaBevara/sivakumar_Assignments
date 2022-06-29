package Lambda;

import java.util.HashMap;

public class Problem7 {
	public static void main(String[] args) {
		StringBuilder mix = new StringBuilder();
		HashMap<Integer, String> value = new HashMap<>();
		value.put(1, "nice");
		value.put(2, "done");
		value.put(3, "join");
		value.put(4, "aggregate");

		value.entrySet().forEach(t -> mix.append(t));
		System.out.println(mix);
	}
}