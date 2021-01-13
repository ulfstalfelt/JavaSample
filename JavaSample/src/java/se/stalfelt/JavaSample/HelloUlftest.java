/*
 * HelloUlftest.java
 *
 * created at Jan 13, 2021 by S35240 <YOURMAILADDRESS>
 * 
 * $Id: $
 *
 * Copyright (c) 2021 SEEBURGER AG, Germany. All Rights Reserved.
 */
package se.stalfelt.JavaSample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloUlftest {

	@Test
	void ctest() {
		System.out.println("ctest");
		HelloUlf.PrinHelloStalfelt();
		HelloUlf.PrinHelloUlf();
	}
	@Test
	void atest() {
		System.out.println("testadd");
		System.out.println(AddInt.myMethod(5,6 ));
	}


}



