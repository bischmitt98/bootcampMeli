package oop.oop05.interfaces;

import oop.oop05.models.Document;

public interface Printable {
    static void printDocument(Document document){
        System.out.println(document.toString());
    }
}
