/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_dannacasco;

import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Ex2P1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stardewval();
    }
    
    public static void  stardewval(){
        Scanner entrada = new Scanner(System.in);
        Granja gran = new Granja();

        int opcion;
        int dias = 1;
        int dcosechas = 5;
        int cosechas = 0;
        String nvaca = "";
        String ncone = "";
        String nomgran = "";

        System.out.println("¡¡ BIENVENID@ !! ");
        System.out.print("Ingrese el nombre de su granja :  ");
        nomgran = entrada.next();
        System.out.println("--------------------------------");
        System.out.println("¡¡BIENVENIDO A " + nomgran + " granja");
        System.out.println("--------------------------------");
        System.out.println("");
        do {
            System.out.println("");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. plantar cosechas\n2.cosechar las cosechas\n3.conseguir animales\n4.vender cosas\n5.Dormir\n6.rating");
            System.out.print("Ingrese una opcion:  ");
            opcion = entrada.nextInt();

            if (opcion > 1 || opcion < 5) {
                System.out.println("------Dia : " + dias + " -------");
                dias++;
            }
            if (dcosechas == 0) {
                System.out.println("¡¡YA ESTAN LISTAS LAS COSECHAS !!");
                dcosechas = 5;
            }

            switch (opcion) {

                case 1:

                    if (dcosechas >= 5) {
                        System.out.println("--PLANTAR COSECHAS---");
                        System.out.println("Cuantas plantas va a cosechar? ");
                        cosechas = entrada.nextInt();
                        System.out.println("PLANTANDO COSECHAS...");
                        System.out.println("Las cosechas tardan " + dcosechas + " en estar");
                        dcosechas--;
                    } else {
                        System.out.println("YA ESTA COSECHANDO...");
                        dcosechas--;
                    }
                    System.out.println("--FIN DEL DIA--");

                    break;
                case 2:
                    if (cosechas == 0) {
                        System.out.println("NO ESTA COSECHANDO ");
                    } else if (dcosechas <= 5) {
                        System.out.println("Faltan " + dcosechas + " para que esten listas las cosechas !");
                        dcosechas--;
                    } else {
                        gran.veg(cosechas);
                    }
                    System.out.println("--FIN DEL DIA--");

                    break;
                case 3:
                    if (dcosechas < 5) {
                        System.out.println("");
                        System.out.println("Faltan " + dcosechas + " para que esten listas las cosechas !");
                        dcosechas--;
                    }
                    System.out.println(" ");
                    System.out.println("Cantidad de dinero actual : " + gran.getDinero());
                    System.out.println("1.conejos -> 150 monets");
                    System.out.println("2.Vacas -> 350 monets");
                    System.out.println("Que animales desea ?");
                    int animal = entrada.nextInt();
                    if (animal<1||animal>2){
                        System.out.println("OPCION INBVALIDA");
                    }else{
                    if (animal == 1) {
                        System.out.print("cuantos conejos desea? ");
                        int cone = entrada.nextInt();
                        for (int i = 0; i < cone; i++) {
                            System.out.print("Ingrese el nombre de su nuevo conejo: ");
                            ncone = entrada.next();
                            System.out.println(ncone + " Ha sido enviad@ a la granja ! ");
                            gran.listaconejos(ncone);

                        }
                        int total = cone * 150;
                        if (total > gran.getDinero()) {
                            System.out.println("NO TIENE SUFICIENTE DINERO PARA LA COMPRA");
                            for (int i = 0; i < cone; i++) {
                                gran.removeconejos(ncone);
                            }

                        } else {
                            System.out.println("conejos comprados : " + cone);
                            gran.moncon(total);
                        }
                    } else {
                        System.out.print("cuantas vacas desea? ");
                        int vac = entrada.nextInt();
                        for (int i = 0; i < vac; i++) {
                            System.out.print("Ingrese el nombre de su nueva vaca: ");
                            nvaca = entrada.next();
                            System.out.println(nvaca + " Ha sido enviad@ a la granja ! ");
                            gran.listavacas(nvaca);

                        }
                        int total2 = vac * 350;
                        if (total2 > gran.getDinero()) {
                            System.out.println("NO TIENE SUFICIENTE DINERO PARA LA COMPRA ");
                            for (int i = 0; i < vac; i++) {
                                gran.removevacas(nvaca);

                            }
                        } else {
                            gran.monvac(total2);
                        }
                    }
                    }
                    System.out.println("Tu nueva cantidad de dinero es : " + gran.getDinero());
                    System.out.println("--FIN DEL DIA--");

                    break;
                case 4:
                    System.out.println("");
                    if (dcosechas < 5) {
                        System.out.println("Faltan " + dcosechas + " para que esten listas las cosechas !");
                        dcosechas--;
                    }

                  /*  if (gran.sizeconejos() == 0 || gran.sizevacas() == 0 || gran.sizevegtales() == 0) {
                        System.out.println("NO TIENE NADA PARA VENDER");
                        System.out.println("");
                    } else {*/
                        System.out.println("");
                        System.out.println("Que desea vender ? ");
                        System.out.println("");
                        System.out.println("----ANALISIS DE LA GRANJA----");
                        gran.printgranja();
                        System.out.println("Tiene " + gran.getDinero());

                        System.out.println("-----------------------------");
                        System.out.println("1. conejos\n2.vacas\n3.vegetales");
                        System.out.print("Ingrese una opcion : ");
                        int venta = entrada.nextInt();
                       if (venta<1||venta>3){
                           System.out.println("OPCION INVALIDA");
                       }else{
                           
                       
                        switch (venta) {
                            case 1:
                                System.out.println("La cantidad de conejos es :" + gran.sizeconejos());
                                gran.nameconejos();
                                System.out.print("Ingrese la cantidad a vender:");
                                int vender = entrada.nextInt();

                                System.out.println("Bye bye " + gran.getConejos());
                                gran.removeconejos();
                                System.out.println("Se ha vendido " + vender + " conejos");
                                int tot = vender * 170;
                                gran.monventac(tot);
                                System.out.println("Tu nueva cantidad de dinero es : " + gran.getDinero());
                                break;

                            case 2:
                                System.out.println("La cantidad de vacas es :" + gran.sizevacas());
                                gran.namevacas();
                                System.out.print("Ingrese la cantidad a vender:");
                                int vender2 = entrada.nextInt();

                                System.out.println("Bye bye " + gran.getVacas());
                                gran.removevacas();
                                System.out.println("Se ha vendido " + vender2 + " vacas");
                                int tot2 = vender2 * 400;
                                gran.monventav(tot2);
                                System.out.println("Tu nueva cantidad de dinero es : " + gran.getDinero());
                                break;

                            case 3:
                                System.out.println("La cantidad de vegetales es :" + gran.sizevegtales());
                                System.out.print("Ingrese la cantidad a vender:");
                                int vender3 = entrada.nextInt();

                                System.out.println("Bye bye " + gran.getVacas());
                                System.out.println("Se ha vendido " + vender3 + " vegatales");
                                int tot3 = vender3 * 100;
                                gran.monventav(tot3);
                                System.out.println("Tu nueva cantidad de dinero es : " + gran.getDinero());
                                break;
                        }
                    }
                    
                    System.out.println("--FIN DEL DIA--");

                    break;

                case 5:
                    System.out.println("Buenas noches :)");
                    if (dcosechas < 5) {
                        dcosechas--;
                    }
                    System.out.println("--FIN DEL DIA--");

                    break;
                    
                case 6:
                    System.out.print("que le parecio el juego del 1-10 ? ");
                    int num = entrada.nextInt();
                    System.out.println("Que cambios le haría : ");
                    String op = entrada.next();
                    System.out.println(" ");
                    System.out.println("Gracias por su opinion , la tomaremos en cuenta para siguientes creaciones :)");
                    break;
                default:
                    System.out.println("¡¡INGRESE UNA OPCION VALIDA !!");

            }
        } while (opcion<6 || opcion >6);

    }

}
