/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw39443990
 *
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MacBookAir mac = new MacBookAir("Apple", "Air turbo", 456);
		
		MacBookAir macClone = (MacBookAir) mac.clone();
		
		System.out.println(mac.equals(macClone));  //true
		System.out.println(mac == macClone);  //false
	}

}
