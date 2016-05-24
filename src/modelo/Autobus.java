package modelo;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;

/**
 * Clase que define un autobus
 */
public class Autobus {
  //Atributos de la clase
  private String matricula;
  private int plazas;

  //Atributos normalización
  private Linea numLinea;
  private ArrayList<Turno> listTurnos;

  /**
   * Constructor de la clase con control de errores
   * @throws Exception
   */
  public Autobus(String matricula, int plazas, Linea numLinea)
      throws Exception {
    if (matricula == null || numLinea == null || plazas < 0)
      throw new Exception();
    this.matricula = matricula;
    this.plazas = plazas;
    this.numLinea = numLinea;
    listTurnos = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Autobus{" +
        "numLinea=" + numLinea +
        ", plazas=" + plazas +
        ", matricula='" + matricula + '\'' +
        '}';
  }

  public void addTurno(Turno turno) throws Exception {
    if (turno == null) throw new Exception();
    listTurnos.add(turno);
  }
}