package com.zl.base;

import java.rmi.Naming;

public class RemoteMainTest {
	public static void main(String[] args) {
		try{
			CandyMachine service = new CandyMachine();
			Naming.rebind("rmi:127.0.0.1:9602/test", service);
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}
