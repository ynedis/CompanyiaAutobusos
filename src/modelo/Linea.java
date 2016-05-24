package modelo;

import java.util.ArrayList;

/**
 * Clase que describe las diferentes Lineas de Autobuses 17/05/2016.
 */
public class Linea {
  //Atributos de la clase
  private int numLinea;

  //Atributos normalización
  private ArrayList<Autobus> autobuses ;
  private ArrayList<Asignadas> asignadas;
  private ArrayList<Veterano> veteranos;
  private ArrayList<ParadasLinea> paradasLineas;

  public Linea(int numLinea) throws Exception{
    if (numLinea<0) throw new Exception();
    this.numLinea = numLinea;
    autobuses = new ArrayList<>();

  }

  public void addAutobuses (Autobus autobus) throws Exception {
    if (autobus == null) throw new Exception();
    this.autobuses.add(autobus);
  }

  public void addParadasLineas (ParadasLinea paradasLinea) throws Exception {
    if (paradasLinea == null) throw new Exception();
    this.paradasLineas.add(paradasLinea);
  }
}
