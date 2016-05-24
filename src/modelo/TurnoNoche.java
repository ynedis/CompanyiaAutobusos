package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by poo2 on 23/05/2016.
 */
public class TurnoNoche extends Turno {

  // Atributos de normalización
  ArrayList<Incidencia> lIncidencias;

  public TurnoNoche(Conductor conductor, LocalDate fecha,
                    TipoTurno tTurno, Autobus autobus) throws Exception {
    super(conductor, fecha, tTurno, autobus);
    lIncidencias = new ArrayList<>();
  }

  public void addIncidencias(Incidencia incidencia) throws Exception{
    if (incidencia == null) {
      throw new Exception();
    }
    lIncidencias.add(incidencia);
  }
}
