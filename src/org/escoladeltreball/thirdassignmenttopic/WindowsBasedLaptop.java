/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw39443990
 *
 */
public final class WindowsBasedLaptop extends Labtop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public WindowsBasedLaptop(String marca, String model, int speed) {
		super(marca, model, speed, LabtopType.HEAVY);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public WindowsBasedLaptop(String marca, String model) {
		this(marca, model, 399);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("clickint inicio to turn off");

	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#overclock()
	 */
	@Override
	public int overclock() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
