/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_dannacasco;



/**
 *
 * @author Danna Casco
 */
class vaca {
    String nombre;
    int precio;

    public vaca(String nombre) {
        this.nombre = nombre;
        this.precio = 350;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
  

    @Override
    public String toString() {
        return "vaca{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }


    
   
}
