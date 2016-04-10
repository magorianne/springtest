/**
 * 
 */
package com.ib.service.impl;

import com.ib.service.Hello;

/**
 * @author ib
 *
 */
public class HelloImpl implements Hello {

	private final String name;
	/* (non-Javadoc)
	 * @see com.ib.service.Hello#sayHello()
	 */
	public HelloImpl(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String sayHello() {
		return "Hello Spring Framework !";
	}

	@Override
	public String sayHelloParameter() {
		return String.format("Hello to %s", name);
	}
}
