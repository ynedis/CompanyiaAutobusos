package modelo;

import java.time.LocalDate;
/**
 * Clase Asociativa que describe el turno 17/05/2016.
 */
public class Turno {
  public enum TipoTurno {
    MAÑANA , TARDE, NOCHE;
  }
  //Atributos
  float numHoras;

  //Atributos normalización
  Conductor conductor;
  LocalDate fecha;
  TipoTurno tTurno;
  Autobus autobus;

  public Turno(Conductor conductor, LocalDate fecha, TipoTurno tTurno,
               Autobus autobus) throws Exception {
    if (conductor == null || tTurno == null || fecha == null
          || autobus == null
          || (tTurno != TipoTurno.MAÑANA && tTurno != TipoTurno.TARDE
              && tTurno!= TipoTurno.NOCHE)) {
      throw new Exception();
    }
    this.numHoras = numHoras;
    this.conductor = conductor;
    this.fecha = fecha;
    this.tTurno = tTurno;
    this.autobus = autobus;
  }

  public void setNumHoras(float numHoras) throws Exception {
    if (numHoras<0) throw new Exception();
    this.numHoras = numHoras;
  }
}
