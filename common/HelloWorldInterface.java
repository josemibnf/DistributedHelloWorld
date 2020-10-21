package common;

import java.rmi.Remote;

public interface HelloWorldInterface extends Remote {
    String helloWorld (String name);
}