package org.dimigo.oop2;

public class Singletor {
    private static Singletor instance;

    private Singletor() { }

    public static synchronized Singletor getInstance() {
        if(instance == null) {
            instance = new Singletor();
        }
        return instance;
    }
}
