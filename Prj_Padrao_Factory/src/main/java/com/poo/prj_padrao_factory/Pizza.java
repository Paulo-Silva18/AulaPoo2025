/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prj_padrao_factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFTM
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    
    public String getName() {
        return name;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
    }
    public void bake() {
        System.out.println("Baking " + name);
    }
    public void cut() {
        System.out.println("Cutting " + name);
    }
    
    public void box() {
        System.out.println("Boxing " + name);
    }
    
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
