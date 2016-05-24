package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 24/05/2016.
 */
public class Asignadas {
  // Atributos
  int numHoras;

  // Atributos Normalizacion
  ArrayList<Practicas> lPracticas;
  ArrayList<Linea> lLineas;

  public Asignadas(int numHoras) throws Exception {
    if (numHoras<0 || (this.numHoras+numHoras)>100) {
      throw new Exception();
    }

    this.numHoras = numHoras;
    lPracticas = new ArrayList<>();
    lLineas = new ArrayList<>();
  }

  public void addPracticas(Practicas practicas) throws Exception {
    if (practicas == null) {
      throw new Exception();
    }
    lPracticas.add(practicas);
  }

  public void addLineas(Linea linea) throws Exception {
    if (linea == null) {
      throw new Exception();
    }
    lLineas.add(linea);
  }
}
