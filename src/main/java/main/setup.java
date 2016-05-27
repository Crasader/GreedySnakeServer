package main;

import model.GameRemote;
import model.GameRemoteImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by chenh on 2016/5/27.
 */
public class setup {

    public static void main(String[] args) {
        try {
            GameRemote hello = new GameRemoteImpl();
            Registry registry= LocateRegistry.createRegistry(32000);
            registry.rebind("hello", hello);
            System.out.print("Ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
