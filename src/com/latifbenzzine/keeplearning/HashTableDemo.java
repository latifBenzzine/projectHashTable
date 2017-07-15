package com.latifbenzzine.keeplearning;

import java.util.*;
import java.util.Map.Entry;
public class HashTableDemo {

   public static void main(String args[]) {
      // Create a hash map
      Hashtable<String, Double> balance = new Hashtable<String, Double>();
      Enumeration<String> names;
      String str;
      double bal;
      balance.put("Zara", new Double(3434.34));
      balance.put("Mahnaz", new Double(123.22));
      balance.put("Ayan", new Double(1378.00));
      balance.put("Daisy", new Double(99.22));
      balance.put("Qadir", new Double(-19.08));
      
      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " + balance.get(str));
      }        
      System.out.println();
      
      // Deposit 1,000 into Zara's account
      bal = ((Double)balance.get("Zara")).doubleValue();
      balance.put("Zara", new Double(bal + 1000));
      System.out.println("Zara's new balance: " + balance.get("Zara"));
      System.out.println();
      HashMap<String , Integer> contacts = new HashMap<>();  
      String name = null;
      Integer age = 0;
      contacts.put("Ali", 27);
      contacts.put("Mohammed", 29);
      contacts.put("Abbas", 34);
      contacts.put("Khalil", 47);

      Iterator<Entry<String, Integer>> it = contacts.entrySet().iterator();
      
      while(it.hasNext()){
          name =  it.next().getKey();
          System.out.println(name + ": " + contacts.get(name));
       }        
       System.out.println();
      //correct Ali's age
       age = ((Integer)contacts.get("Ali")).intValue();
       contacts.put("Ali", new Integer(age + 5));
       System.out.println("Ali's new age: " + contacts.get("Ali"));
       System.out.println();
       it = contacts.entrySet().iterator();
       while(it.hasNext()){
           name =  it.next().getKey();
           System.out.println(name + ": " + contacts.get(name));
        }   
   }
}