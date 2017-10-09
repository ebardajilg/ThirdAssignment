/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw39443990
 *
 */
public final class MacBookAir extends Labtop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public MacBookAir(String marca, String model, int speed) {
		super(marca, model, speed, LabtopType.ULTRALIGHT);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public MacBookAir(String marca, String model) {
		this(marca, model, 367);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("clasing mac smothly");

	}

	@Override
	public int overclock() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



}
