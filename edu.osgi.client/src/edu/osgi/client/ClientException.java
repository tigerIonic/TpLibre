package edu.osgi.client;

public class ClientException extends java.lang.Exception {
    public ClientException(String m) throws Exception {
        throw new Exception(m);
    }
}
