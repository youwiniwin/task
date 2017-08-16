package com.zl.base;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote{

	protected CandyMachine() throws RemoteException {
		super();
		
	}

	@Override
	public String getLocation() throws RemoteException {
		System.out.println("getLocation in ok!");
		return "0000";
	}

	@Override
	public int getCount() throws RemoteException {
		System.out.println("getCount in ok!");
		return 33;
	}

}
