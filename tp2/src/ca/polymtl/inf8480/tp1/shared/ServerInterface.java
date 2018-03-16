package ca.polymtl.inf8480.tp1.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
    int calculateSum(String filePath) throws RemoteException;

    int getQ() throws RemoteException;
}
