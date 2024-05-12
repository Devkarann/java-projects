package com.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.entity.Contact;

public interface Utility {

	public static Map<String, Contact> contactMap = new HashMap<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void removeAllWhoAre80Above() {
		
		Set<Entry<String, Contact>> entrySet = contactMap.entrySet();
		Iterator<Entry<String, Contact>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<String, Contact> entry = iterator.next();
			Contact contact = entry.getValue();
			
			LocalDate today = LocalDate.now();
			Period period = Period.between(contact.getDateOfBirth(), today);
			
			int age = period.getYears();
			
			if(age > 80) {
				iterator.remove();
			}
		}
		
		
	}
}
