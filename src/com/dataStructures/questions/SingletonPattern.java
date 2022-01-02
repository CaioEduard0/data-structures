package com.dataStructures.questions;

public class SingletonPattern {

    public static void main(String[] args) {
        
    }
}

class Singleton {
    public static String str;
    private static final Singleton INSTANCE = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getSingleInstance() {
    	return INSTANCE;
    }
}
