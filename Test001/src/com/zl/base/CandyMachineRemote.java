package com.zl.base;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CandyMachineRemote extends Remote{
	
	public String getLocation() throws RemoteException;
	public int getCount() throws RemoteException;

}
