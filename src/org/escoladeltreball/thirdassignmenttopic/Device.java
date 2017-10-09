package org.escoladeltreball.thirdassignmenttopic;

public interface Device extends Cloneable {
	
	/**
	 * Turns device on
	*/
	public abstract void trunOn();
	/**
	 * Turns device off
	*/	
	public abstract void turnOff();
	/**
	 * Causes device to over clock
	 * @return 
	 * @throws Exception
	*/
	public abstract int overclock() throws Exception;
	
}
