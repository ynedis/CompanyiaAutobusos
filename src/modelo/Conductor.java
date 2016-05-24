package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase que define al Conductor 17/05/2016.
 */
public class Conductor {
  //Atributos
  private String dni;
  private String nombre;

  //Atributos normalización
  ArrayList<Turno> listTurnos;
  ArrayList<LocalDate> listFechas;

  public Conductor (String dni, String nombre) throws Exception{
    if (dni==null || nombre==null) throw new Exception();
    this.dni = dni;
    this.nombre = nombre;
    listTurnos = new ArrayList<>();
    listFechas = new ArrayList<>();
  }
}
