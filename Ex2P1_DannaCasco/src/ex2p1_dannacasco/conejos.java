/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_dannacasco;

import java.util.ArrayList;

/**
 *
 * @author Danna Casco
 */
class conejos {
    String name;
    int precio;

    public conejos(String name) {
        this.name = name;
        this.precio = 170;
    }

    public String getName() {
        return name;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "conejos{" + "name=" + name + ", precio=" + precio + '}';
    }


    
    
    
}
