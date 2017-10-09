/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw39443990
 *
 */
public abstract class Labtop extends DeviceImpl {
	
	private LabtopType type;
	
	public Labtop(String marca, String model, int speed, LabtopType type) {
		super(marca, model, speed);
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#trunOn()
	 */
	@Override
	public void trunOn() {
		System.out.println("turning on");

	}
}