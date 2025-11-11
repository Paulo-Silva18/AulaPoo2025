/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_padrao_singleton;

/**
 *
 * @author IFTM
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;
    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }
    
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }
    
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isBoiled() {
        return boiled;
    }
    
    public void situation() {
        System.out.println("Empty: " +String.valueOf(empty)+" Boiled: "+String.valueOf(boiled));
    }
    
}
