package oop.labor09_2;

import oop.labor09.ArrayListQueue;

import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words = new ArrayList<>();
    private static ArrayListDictionary instance;

    private ArrayListDictionary() {

    }

    @Override
    public boolean add(String s) {
        return false;
    }

    @Override
    public boolean find(String s) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
