package main;


import java.security.SecureRandom;
import java.util.Iterator;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		TreeSet<Integer> bt = new TreeSet<Integer>();
	    int max=90000;
	    int min=1;
		SecureRandom random = new SecureRandom();
		for (int i = 0; i <= 30000; i++) {
		    Integer value = Integer.valueOf(random.nextInt(max-min+1)+min);
			bt.add(value);
		}
        
		for (Iterator iterator = bt.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println("Numero de elementos gerados <" + bt.size() + ">");

	}

}
