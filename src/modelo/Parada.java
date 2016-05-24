package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Parada {
  //Atributos
  private String nombre;

  //Atributos normalización
  ArrayList<Linea> lLineas;

  public Parada(String nombre) throws Exception{
    if (nombre == null || nombre.equals("")){
      throw new Exception();
    }
    this.nombre = nombre;
    lLineas = new ArrayList<>();
  }

  public void addLineas(Linea linea) throws Exception{
    if(linea == null){
      throw new Exception();
    }
    lLineas.add(linea);
  }

}
