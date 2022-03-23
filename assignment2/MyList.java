package com.company.assignment2;

import java.util.Arrays;

public class MyList<T> {
    private static final boolean ALLOW_DYNAMIC_RESIZE = true;
    private Object[] arr;

    public MyList(int size) {
        if(size >= 0) {
            arr = new Object[size];
        }
    }

    public void add(T element) throws RuntimeException{
        boolean elemInserted = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == null) {
                elemInserted = true;
                arr[i] = (Object) element;
                break;
            }
        }
        if(!elemInserted) {
            if(ALLOW_DYNAMIC_RESIZE) {
                extendLengthTo(arr.length * 2);
                add(element);
            }
            else
                throw new RuntimeException("MyList: List is full, cannot insert element");
        }
    }

    public boolean lookup(T element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void extendLengthTo(int size) {
        if(size > arr.length) {
            arr = Arrays.copyOf(arr, size);
            System.out.println("MyList: Extended array length to " + size);
        }
    }

    public void print() {
        System.out.println("Printing MyList contents: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                System.out.println(String.format("[%d]: \"%s\"", i, ((T)arr[i].toString())));
            }
            else {
                System.out.println(String.format("[%d]: null", i));
            }
        }
    }
}
