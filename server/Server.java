package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import common.HelloWorldInterface;

public class Server {
    public static void main(String[] args){
        try{
            HelloWorld obj = new HelloWorld();
            HelloWorldInterface skleton = (HelloWorldInterface) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("helloworld", skleton);
            System.out.println("Starting server ...\n");
        } catch (Exception e) {
            System.err.println("Exception: .." + e.toString());
            e.printStackTrace();
        }
    }
}
