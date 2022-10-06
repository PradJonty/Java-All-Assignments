package com.valtech.training.corejava.day02;

import com.valtech.training.corejava.day01.Animal;



public class Anonymous {
    public static void main(String[] args) {
        Animal a=new Animal() {
            
            int counter=0;
            
            public void makeSound() {
                counter++;
                System.out.println("Anon..."+counter);
            }
        
    };
        a.makeSound();
        a.makeSound();
    }
}