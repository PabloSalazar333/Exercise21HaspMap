package com.exercise21haspmap.app;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapApp {

	public static void main(String[] args) 
	{
		// 
		HashMap<Integer, String> miHash = new HashMap<Integer, String>();
		miHash.put(1, "Mario");
		miHash.put(2, "David");
		miHash.put(3, "Jorge");
		miHash.put(4, "Carlos");
		miHash.put(5, "Uriel");
		
		for(int i=0; i<=miHash.size();i++)
		{
			if(miHash.containsKey(i))
			{
				System.out.println(miHash.get(i));
			}
		}
		for(Entry<Integer, String> miMap : miHash.entrySet())
		{
			System.out.println(String.format("The key is:%d, value: %s", miMap.getKey(),miMap.getValue()));
		}
	}

}
