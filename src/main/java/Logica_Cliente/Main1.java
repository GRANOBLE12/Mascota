/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperValidacion;
import Logica_Negocio.Perro;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Santiago Lopez
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opc = 0, cant_p;
        String nombre, id, raza, nom_p, id_buscar;
        int retorno, caracter_e;
        boolean rta;

        Scanner scan = new Scanner(System.in);

        ArrayList<Perro> lsperros = new ArrayList<>();
        ArrayList<Persona> lspersonas = new ArrayList<>();
        do {
            System.out.println("1. Registrar persona");
            System.out.println("2. Visualizar Persona");
            System.out.println("3. Consultar Persona");
            System.out.println("4. Salir");
            do {
                try {

                    System.out.println("Digite una opcion valida");
                    opc = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);

            switch (opc) {
                case 1:
                    //Nombre
                    lsperros = new ArrayList<>();
                    System.out.println("Digite el nombre de la persona");
                    nombre = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(nombre);

                    while (rta) {
                        System.out.println("Digite el nombre de la persona");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                    }
                    rta = HelperValidacion.ValidarVacio(nombre);
                    retorno = HelperValidacion.RetornarValor(nombre);
                    caracter_e = HelperValidacion.RetornarCEV2(nombre);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite el nombre de la persona");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                        retorno = HelperValidacion.RetornarValor(nombre);
                        caracter_e = HelperValidacion.RetornarCEV2(nombre);

                    }
                    //Termina Nombre

                    //Id
                    System.out.println("Digite el id de la persona");
                    id = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(id);

                    while (rta) {
                        System.out.println("Digite el id de la persona");
                        id = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(id);
                    }
                    rta = HelperValidacion.ValidarVacio(id);
                    retorno = HelperValidacion.RetornarLetra(id);
                    caracter_e = HelperValidacion.RetornarCEV2(id);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite el id de la persona");
                        id = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(id);
                        retorno = HelperValidacion.RetornarLetra(id);
                        caracter_e = HelperValidacion.RetornarCEV2(id);
                    }

                    //Termina id
                    //Cantidad Perros
                    System.out.println("Digite la cantidad de perros de la persona");
                    cant_p = scan.nextInt();

                    scan.nextLine();

                    int vc = HelperValidacion.ValidarCantidadRango(cant_p);

                    //Crear Lista Perros
                    if (vc == 1) {
                        for (int i = 0; i < cant_p; i++) {
                            //Nombre Perro
                            System.out.println("Digite el nombre del perro" + "\t" + (i + 1));
                            nom_p = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(nom_p);

                            while (rta) {
                                System.out.println("Digite el nombre del perro" + "\t" + (i + 1));
                                nom_p = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(nom_p);
                            }
                            rta = HelperValidacion.ValidarVacio(nom_p);
                            retorno = HelperValidacion.RetornarValor(nom_p);
                            caracter_e = HelperValidacion.RetornarCEV2(nom_p);

                            while (retorno != 0 || rta == true || caracter_e != 0) {
                                System.out.println("Digite el nombre del perro" + "\t" + (i + 1));
                                nom_p = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(nom_p);
                                retorno = HelperValidacion.RetornarValor(nom_p);
                                caracter_e = HelperValidacion.RetornarCEV2(nom_p);

                            }

                            //Fin Nombre Perro
                            //Inicia Raza
                            System.out.println("Digite la raza del perro" + "\t" + (i + 1));
                            raza = scan.nextLine();

                            rta = HelperValidacion.ValidarVacio(raza);

                            while (rta) {
                                System.out.println("Digite la raza del perro" + "\t" + (i + 1));
                                raza = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(raza);
                            }
                            rta = HelperValidacion.ValidarVacio(raza);
                            retorno = HelperValidacion.RetornarValor(raza);
                            caracter_e = HelperValidacion.RetornarCEV2(raza);

                            while (retorno != 0 || rta == true || caracter_e != 0) {
                                System.out.println("Digite la raza del perro" + "\t" + (i + 1));
                                raza = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(raza);
                                retorno = HelperValidacion.RetornarValor(raza);
                                caracter_e = HelperValidacion.RetornarCEV2(raza);

                            }
                            //Termina Raza

                            Perro objperro = new Perro(nom_p, raza);
                            lsperros.add(objperro);
                        }
                    } else {
                        System.out.println("Cantidad Invalida");
                        break;
                    }

                    //Fin Cantidad Perros
                    //Crear Persona
                    Persona objpersona = new Persona(id, nombre);

                    //Crear asociacion 
                    objpersona.setLsperros(lsperros);
                    lspersonas.add(objpersona);
                    break;

                case 2:
                    if (!lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersona(lspersonas);
                    } else {
                        System.out.println("La lista de personas no esta llena");
                    }
                    break;

                case 3:
                    System.out.println("Digite el id de la persona");
                    id_buscar = scan.nextLine();
                    if (!lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersonaBuscada(lspersonas, id_buscar);
                    } else {
                        System.out.println("La lista de personas no esta llena");
                    }
                    break;

            }
        } while (opc != 4);

    }

}
