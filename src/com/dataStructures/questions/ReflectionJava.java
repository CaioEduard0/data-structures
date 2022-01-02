package com.dataStructures.questions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Studentt {
    private String name;
    private String id;
    private String email;
    private String kkk;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}

public class ReflectionJava {
	
	public static void main(String[] args){
        Class<Studentt> student = Studentt.class;
        Field[] fields = student.getDeclaredFields();
        Method[] methods = student.getDeclaredMethods();
        
        ArrayList<String> fieldList = new ArrayList<>();
        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i < methods.length; i++){
        	fieldList.add(fields[i].getName());
            methodList.add(methods[i].getName());
        }
        Collections.sort(fieldList);
        for(String name: fieldList){
            System.out.println(name);
        }
        System.out.println();
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
	
}
