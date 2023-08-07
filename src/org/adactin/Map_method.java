package org.adactin;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_method {

	public static void main(String[] args) {
		Map<String,Integer> age =new HashMap<>();
		
		age.put("rajavel", 29);
		age.put("sathish", 26);
		age.put("vijay", 50);
		age.put("arun", 29);
		age.put("vishnu", 33);
		
		System.out.println(age);
		System.out.println(age.values());
		
		System.out.println(age.containsKey("vijay"));
		System.out.println(age.containsValue(50));
		System.out.println(age.get("rajavel"));
		
		System.out.println(age.keySet());
		System.out.println(age.entrySet());
	/*	Map<Integer,String> fd =new LinkedHashMap<>();
		fd.put(10, "britania");
		fd.put(20,"unibic");
		fd.put(30,"dairymilk");
		fd.put(40,"hatsun");
		
		
		System.out.println(fd);
		
		Map<Integer,String> sd =new TreeMap<>();
		
		sd.put(10, "sandal");
		sd.put(20, "cinthal");
		sd.put(30, "dove");
		sd.put(40, "himalaya");
		//sd.put(null,"fsfs"); null point exception
		System.out.println(sd);*/
		
		
		
		

	}

}
