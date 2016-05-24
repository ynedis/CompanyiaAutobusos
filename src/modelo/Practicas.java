package modelo;

import java.util.ArrayList;

/**
 * Clase que define a los trabajadores en Práctica 17/05/2016.
 */
public class Practicas extends Conductor {

  //Atributos normalización
  private ArrayList<Linea> lAsignadas;
  public Practicas(String dni, String nombre) throws  Exception{
    super (dni, nombre);
    lAsignadas = new ArrayList<>();

  }

  public void addAsignada(Linea linea) throws  Exception {
    if (linea == null) throw new Exception();
    lAsignadas.add(linea);
  }
}
