/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {
    
    
 public static void ImprimirPersona(ArrayList<Persona> lspersonas)
 {
     for (int i = 0; i < lspersonas.size(); i++) {

                        System.out.println("El nombre de la persona es:" + "\t" + lspersonas.get(i).getNombre());
                        System.out.println("La identificacion de la persona es:" + "\t" + lspersonas.get(i).getIdentificacion());
                        System.out.println("\n");

                        for (int j = 0; j < lspersonas.get(i).getLsperros().size(); j++) {
                            System.out.println("Perro" + "\t"+(j + 1) + "\n");
                            System.out.println("El nombre del perro es:" + "\t" + lspersonas.get(i).getLsperros().get(j).getNombre());
                            System.out.println("La raza del perro es:" + "\t" + lspersonas.get(i).getLsperros().get(j).getRaza());
                            System.out.println("\n");
                        }
                    }
 }
 
 
  public static void ImprimirPersonaBuscada(ArrayList<Persona> lspersonas, String id_buscar)
 {
     int bandera=0;
     for (int i = 0; i < lspersonas.size(); i++) {

                        if (id_buscar.equals(lspersonas.get(i).getIdentificacion())) {
                            bandera=1;
                            System.out.println("El nombre de la persona es:" + "\t" + lspersonas.get(i).getNombre());
                            System.out.println("La identificacion de la persona es:" + "\t" + lspersonas.get(i).getIdentificacion());
                            System.out.println("\n");

                            for (int j = 0; j < lspersonas.get(i).getLsperros().size(); j++) {
                                System.out.println("Perro" + "\t"+(j + 1) + "\n");
                                System.out.println("El nombre del perro es:" + "\t" + lspersonas.get(i).getLsperros().get(j).getNombre());
                                System.out.println("La raza del perro es:" + "\t" + lspersonas.get(i).getLsperros().get(j).getRaza());
                                System.out.println("\n");
                            }
                        }
                    }
                    if(bandera==0)
                    {
                        System.out.println("El id no existe"); 
                    }

     
 }
    
}
