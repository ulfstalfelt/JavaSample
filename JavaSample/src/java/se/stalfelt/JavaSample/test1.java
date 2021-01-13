package se.stalfelt.JavaSample;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void ctest() {
		System.out.println("ctest");
		HelloUlf.PrinHelloStalfelt();
		HelloUlf.PrinHelloUlf();
	}
	@Test
	public void atest() {
		System.out.println("cc");
		System.out.println(AddInt.myMethod(5,6 ));
	}


}
