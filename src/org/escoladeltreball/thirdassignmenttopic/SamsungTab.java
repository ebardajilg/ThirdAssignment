/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw39443990
 *
 */
public class SamsungTab extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public SamsungTab(String marca, String model, int speed) {
		super(marca, model, speed);
		// TODO Auto-generated constructor stub
	}

	public SamsungTab(String marca, String model) {
		this(marca, model, 150);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("clasing samsung smothly");

	}

}
