package vista;

import controlador.Controlador;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase Vista para la gestión de autobuses 17/05/2016.
 */
public class Vista {

  Scanner reader;
  Controlador companyia;

  public Vista () {
    reader = new Scanner (System.in);
    companyia = new Controlador();
  }


  public static void main(String[] args) throws Exception {
    Vista v = new Vista();
    v.menu();
  }

  public void menu() throws Exception {

    while (true) {
      try {
        System.out.println ("\n ################# MENU ################# ");
        System.out.println();
        System.out.println("1. Dar de alta Linea");
        System.out.println("2. Dar de alta Parada");
        System.out.println("3. Dar de alta Parada por Linea");
        System.out.println("4. Dar de alta Autobuses");
        System.out.println("5. Dar de alta Veterano");
        System.out.println("6. Dar de alta Practicas");
        System.out.println("7. Dar de alta Turnos");
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Introduce una opción: ");

        int opcion = Integer.parseInt(reader.nextLine());

        switch (opcion) {
          case 1:
            pedirLinea();
            break;
          case 2:
            pedirParada();
            break;
          case 3:
            pedirParadaLinea();
            break;
          case 4:
            pedirAutobus();
            break;
          case 5:
            pedirVeterano();
            break;
          case 6:
            //pedirPractica();
            break;
          case 7:
            //pedirTurno();
            break;
          case 0:
            return;
          default:
            System.err.println("Opción no válida\n");
        }
      } catch (Exception e) {
        System.err.println("Introduce un número\n");
      }
    }
  }

  public void pedirLinea () throws Exception {
    boolean continuar = true;
    System.out.println ("\n ################# DATOS LINEA ################# ");

    while (continuar) {
      try {
        System.out.print ("\n Introduce la línea: ");
        int linea = Integer.parseInt(reader.nextLine());
        companyia.addLinea (linea);

        continuar = false;
      } catch (Exception e) {
        // Error
        System.err.println(e.getMessage());
        System.err.println();
      }
    }
  }

  public void pedirAutobus () throws Exception {
    boolean continuar = true;
    System.out.println ("\n ################# DATOS AUTOBUS ################# ");

    while (continuar) {
      try {
        System.out.print ("\n Introduce la matrícula: ");
        String matricula = reader.nextLine();
        System.out.print ("\n Introduce el número de plazas: ");
        int plazas = Integer.parseInt(reader.nextLine());
        System.out.print ("\n Introduce la línea: ");
        int linea = Integer.parseInt(reader.nextLine());
        companyia.addAutobuses (matricula, plazas, linea);

        continuar = false;
      } catch (Exception e) {
        // Error
        System.err.println(e.getMessage());
        System.err.println();
      }
    }
  }

  public void pedirParada () throws Exception {
    boolean continuar = true;
    System.out.println ("\n ################# DATOS PARADA ################# ");

    while (continuar) {
      try {
        System.out.print ("\n Introduce la parada: ");
        String parada = reader.nextLine();
        companyia.addParada (parada);

        continuar = false;
      } catch (Exception e) {
        // Error
        System.err.println(e.getMessage());
        System.err.println();
      }
    }
  }

  public void pedirParadaLinea () throws Exception {
    boolean continuar = true;
    System.out.println ("\n ################# DATOS PARADA LINEA ################# ");

    while (continuar) {
      try {
        System.out.print ("\n Introduce la línea: ");
        int linea = Integer.parseInt(reader.nextLine());
        System.out.print ("\n Introduce la parada: ");
        String parada = reader.nextLine();
        System.out.print ("\n Introduce la parada anterior, si existe: ");
        String pAnt = reader.nextLine();
        System.out.print ("\n Introduce la parada posterior, si existe: ");
        String pPost = reader.nextLine();
        companyia.addParadaLinea (parada, linea, pAnt, pPost);

        continuar = false;
      } catch (Exception e) {
        // Error
        System.err.println(e.getMessage());
        System.err.println();
      }
    }
  }

  public void pedirVeterano () throws Exception {
    boolean continuar = true;
    System.out.println ("\n ################# DATOS VETERANO ################# ");

    while (continuar) {
      try {
        System.out.print ("\n Introduce el DNI: ");
        String dni = reader.nextLine();
        System.out.print ("\n Introduce el Nombre: ");
        String nombre = reader.nextLine();
        System.out.print ("\n Introduce la linea que no desea conducir (si existe alguna): ");
        Integer linea = Integer.valueOf(reader.nextLine());
        companyia.addVeterano (dni, nombre, linea);

        continuar = false;
      } catch (Exception e) {
        // Error
        System.err.println(e.getMessage());
        System.err.println();
      }
    }
  }
}
