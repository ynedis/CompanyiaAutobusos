package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ParadasLinea {
  //Atributos

  //Atributos normalización
  private Linea plLinea;
  private Parada plParada;
  private ParadasLinea pAnterior;
  private ParadasLinea pPosterior;

  public ParadasLinea(Linea plLinea, Parada plParada) throws Exception {
    if (plLinea == null || plParada == null) {
      throw new Exception();
    }
    this.plLinea = plLinea;
    this.plParada = plParada;
  }

  public void setAnterior(ParadasLinea pAnterior) throws Exception {
    //La parada anterior debe pertenecer a la misma linea pero no debe ser
    //igual a la parada actual
    if (pAnterior == null || pAnterior.plLinea != this.plLinea
          || pAnterior == this) throw new Exception();

    this.pAnterior = pAnterior;
  }

  public void setPosterior(ParadasLinea pPosterior) throws Exception{
    if (pPosterior == null || pPosterior.plLinea != this.plLinea
        || pPosterior == this) throw new Exception();
    this.pPosterior = pPosterior;
  }
}
