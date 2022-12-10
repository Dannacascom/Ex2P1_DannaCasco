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
class Granja {
    String name;
    ArrayList <vaca> vacas = new ArrayList <>();
    ArrayList <conejos> conejos = new ArrayList <>();
    ArrayList <vegetales> vegetales = new ArrayList <>();
    int dinero;
    


    public void setName(String name) {
        this.name = name;
    }

    public void setVacas(ArrayList<vaca> vacas) {
        this.vacas = vacas;
    }

    public void setConejos(ArrayList<conejos> conejos) {
        this.conejos = conejos;
    }

    public void setVegetales(ArrayList<vegetales> vegetales) {
        this.vegetales = vegetales;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getName() {
        return name;
    }

    public ArrayList<vaca> getVacas() {
        return vacas;
    }

    public ArrayList<conejos> getConejos() {
        return conejos;
    }

    public ArrayList<vegetales> getVegetales() {
        return vegetales;
    }

    public int getDinero() {
        return dinero;
    }

    public Granja() {
        this.name = name;
        this.dinero = 500;
        this.vegetales = new ArrayList <>();
        this.conejos = new ArrayList <>();
        this.vacas = new ArrayList <>();
    }
   
    
   public void printgranja(){
       
    System.out.println("Tiene : "+sizevacas()+" Vacas");
    System.out.println("Tiene : "+sizeconejos()+" Conejos");
    System.out.println("Tiene : "+sizevegtales()+" Vegetales");
   }
   
   public int sizevacas (){
       int sizevacas = vacas.size();
       return sizevacas;
   }
   public int sizeconejos( ){
      int sizeconejos = conejos.size(); 
      return sizeconejos;
   }
   
   public int sizevegtales( ){
       int sizevegetales =vegetales.size(); 
       return sizevegetales;  
   }
   
   public void cone (String name){
    conejos.add(new conejos (name)); 
        }
   public void vac (String name){
       vacas.add(new vaca(name));
   }
   public void veg (int cantidad){
       vegetales.add(new vegetales(100));
   }
   public int moncon (int total){
       dinero = dinero-total;
       return dinero;
   }
   
   public int monvac(int total2){
       dinero = dinero-total2;
       return dinero;
   }
   
   public void nameconejos (){
           for (int i = 0; i < conejos.size(); i++) {
               System.out.println("y sus nombres son :"+conejos.get(i));
       }
           
      }
   
    public void namevacas (){
           for (int i = 0; i < vacas.size(); i++) {
               System.out.println("Y sus nombres son :"+vacas.get(i));
       }
           
      }
    
      public int monventac (int tot){
          this.dinero= dinero+tot;
          return dinero;
          
      }
   
       public int monventav (int tot2){
         this.dinero= dinero+tot2;
          return dinero;
          
      }
       public void listavacas(String name){
           vaca vac = new vaca (name);
           vacas.add(vac);
       }
       public void listaconejos(String name){
           conejos con = new conejos (name);
           conejos.add(con);
       }
       
        public void removeconejos(String name){
           conejos con = new conejos (name);
           conejos.remove(con);
       }
       
         public void removevacas(String name){
           vaca vac = new vaca (name);
           vacas.remove(vac);
       }
         
         public void removeconejos(){
           conejos con = new conejos (name);
           conejos.remove(con);
       }
       
         public void removevacas(){
           vaca vac = new vaca (name);
           vacas.remove(vac);
       }
       
      
  

    @Override
    public String toString() {
        return "Granja{" + "name=" + name + ", vacas=" + vacas + ", conejos=" + conejos + ", vegetales=" + vegetales + ", dinero=" + dinero + '}';
    }

   
   
}

