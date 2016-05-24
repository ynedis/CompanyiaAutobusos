package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Veterano extends Conductor {
  //Atributo
  private Linea noRealiza;

  //Atributo normalización
  private java.util.ArrayList<Linea> lAsignadas;

  public Veterano(String dni, String nombre, Linea noRealiza) throws Exception {
    super(dni, nombre);
    if (noRealiza != null) {
      this.noRealiza = noRealiza;
    }
    lAsignadas = new ArrayList<>();
  }

  public void addLinea(Linea linea) throws Exception{
    if (linea == null) throw new Exception();
    lAsignadas.add(linea);
  }
}
