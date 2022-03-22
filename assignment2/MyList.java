package com.company.assignment2;

public class MyList<T> {
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

    public void print() {
        System.out.println("Printing MyList contents: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                System.out.println(String.format("[%d]: \"%s\"", i, ((T)arr[i].toString())));
            }
            else {
                System.out.println(String.format("[%d]: null"));
            }
        }
    }
}
