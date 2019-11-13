package learning.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		number();
		array();
		arrayList();
		linkedList();
		hashSet();
		linkedHashSet();
		treeSet();
		hashMap();
		hashTable();
		linkedHashMap();
		treeMap();
		createUser();
		createStream();
	}

	private static void number() {
		System.out.println("======================= Number =======================");
		int value = 1_000;
		System.out.println(value);
	}

	private static void array() {
		System.out.println("======================= Array  =======================");
		int[] numList = {10, 20, 30, 40};
		for(int num : numList) {
			System.out.println(num);
		}
	}

	private static void arrayList() {
		System.out.println("======================== List ========================");
		List<String> listString = new ArrayList<String>();
		listString.add("B");
		listString.add("B");
		listString.add("A");
		listString.add("C");

		for (String str : listString) {
			System.out.println(str);
		}

		System.out.println("==================== List lambda 1 ====================");
		listString.forEach(val -> System.out.println(val));

		System.out.println("==================== List lambda 2 ====================");
		listString.forEach(val -> {
			val += "ZZ";
			System.out.println(val);
		});

		System.out.println("================ List method reference ================");
		listString.forEach(System.out::println);
	}

	private static void linkedList() {
		System.out.println("===================== LinkedList ======================");
		List<String> listString1 = new LinkedList<String>();
		listString1.add("B");
		listString1.add("B");
		listString1.add("A");
		listString1.add("C");
		for (String str : listString1) {
			System.out.println(str);
		}
	}

	private static void hashSet() {
		System.out.println("======================= HashSet =======================");
		Set<String> setString = new HashSet<String>();
		setString.add("B");
		setString.add("B");
		setString.add("A");
		setString.add("C");
		for (String str : setString) {
			System.out.println(str);
		}
	}

	private static void linkedHashSet() {
		System.out.println("==================== LinkedHashSet ====================");
		Set<String> setString1 = new LinkedHashSet<String>();
		setString1.add("B");
		setString1.add("B");
		setString1.add("A");
		setString1.add("C");
		for (String str : setString1) {
			System.out.println(str);
		}
	}

	private static void treeSet() {
		System.out.println("======================= TreeSet =======================");
		Set<String> setString2 = new TreeSet<String>();
		setString2.add("B");
		setString2.add("B");
		setString2.add("A");
		setString2.add("C");
		for (String str : setString2) {
			System.out.println(str);
		}
	}

	private static void hashMap() {
		System.out.println("========================= Map =========================");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, null);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
		}

		System.out.println("===================== Map Lambda ======================");
		map.forEach((k, v) -> System.out.println(v));

		System.out.println("==================== Map Lambda 1 =====================");
		map.forEach(Day1::printMap);

		System.out.println("================ Map Method Reference =================");
		map.forEach(Day1::printMap);
	}

	private static void hashTable() {
		System.out.println("====================== HashTable ======================");
		Map<Integer, String> map1 = new Hashtable<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
		}
	}

	private static void linkedHashMap() {
		System.out.println("====================== LinkedHashMap ======================");
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(3, "C");
		map2.put(2, "B");
		for (Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
		}
	}

	private static void treeMap() {
		System.out.println("====================== LinkedHashMap ======================");
		Map<Integer, String> map3 = new TreeMap<Integer, String>();
		map3.put(1, "A");
		map3.put(3, "C");
		map3.put(2, "B");
		for (Map.Entry<Integer, String> entry : map3.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
		}
	}

	private static void createUser() {
		Address addr = new Address("Jakarta");
		User user = new User(1l, "user 1", addr);

		System.out.println("==================== Optional ====================");
		String province = Optional.ofNullable(user)
				.filter(usr -> usr.getId().equals(1l))
				.map(usr -> usr.getAddress())
				.map(address -> address.getProvince())
				.orElse("Address not found");

		System.out.println(province);

		System.out.println("==================== General ====================");
		if (user != null && user.getAddress() != null && user.getId().equals(1l)) {
			System.out.println(user.getAddress().getProvince());
		} else {
			System.out.println("Address not found");
		}
	}
	
	private static void printMap(Integer k, String v) {
		System.out.println("Key : " + k + ", value : " + v);
	}

	private static void createStream() {
		System.out.println("==================== Stream ====================");
		int[] numList = {10, 20, 30, 40};
		Arrays.stream(numList).forEach(System.out::println);
	}

}
