package util;

import interfaces.IShow;

public class ShowScreen implements IShow {

    @Override
    public void show(String msg) {
        System.out.println("On the screen: " + msg);;
    }
}
