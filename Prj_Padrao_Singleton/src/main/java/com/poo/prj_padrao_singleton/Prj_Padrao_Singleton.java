/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prj_padrao_singleton;

/**
 *
 * @author IFTM
 */
public class Prj_Padrao_Singleton {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        boiler.situation();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.situation();
    }
}
