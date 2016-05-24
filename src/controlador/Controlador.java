package controlador;

import modelo.Autobus;
import modelo.Conductor;
import modelo.Linea;
import modelo.Parada;
import modelo.ParadasLinea;
import modelo.Practicas;
import modelo.Turno;
import modelo.Veterano;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase Controlador para la creación de los objetos 22/05/16.
 */
public class Controlador {
    private static HashMap<Integer,Linea> lLineas;
    private static HashMap<String,Autobus> lAutobuses;
    private static HashMap<String,Parada> lParadas;
    private static HashMap<String,ParadasLinea> lParadasLinea;
    private static HashMap<String,Veterano> lVeterano;
    private static HashMap<String,Practicas> lPractica;

    public Controlador(){
        lLineas = new HashMap<>();
        lAutobuses = new HashMap<>();
        lParadas = new HashMap<>();
        lParadasLinea = new HashMap<>();
        lVeterano = new HashMap<>();
        lPractica = new HashMap<>();

    }

    public void addLinea(int linea)
            throws Exception {
        if (lLineas.get(linea) != null) throw new Exception();
        lLineas.put(linea,new Linea(linea));
    };

    public void addAutobuses(String matricula, int plazas, int linea)
            throws Exception {
        Linea olinea = lLineas.get(linea);
        Autobus oAutobus = lAutobuses.get(matricula);
        if (oAutobus != null || olinea == null) throw new Exception();
        Autobus newBus = new Autobus(matricula, plazas, olinea);
        lAutobuses.put(matricula,newBus);

        //Cargamos el autobus en la lista de autobuses de la linea
        olinea.addAutobuses(newBus);
    };

    public void addParada(String parada)
            throws Exception {
        if (lParadas.get(parada) != null) throw new Exception();
        lParadas.put(parada,new Parada(parada));
    };

    public void addParadaLinea(String parada, int linea, String pAnt, String pPost)
            throws Exception {
        String clave = linea +"#"+parada;
        Linea oLinea= lLineas.get(linea);
        Parada oParada = lParadas.get(parada);
        if (linea < 0 || oLinea == null
                || oParada == null
                || lParadasLinea.get(clave) != null
                ) throw new Exception();
        lParadasLinea.put(clave,new ParadasLinea(oLinea, oParada));
        if (pAnt!=null && lParadasLinea.get(pAnt)!= null){
            lParadasLinea.get(clave).setAnterior(lParadasLinea.get(pAnt));
        }
        if (pPost!=null && lParadasLinea.get(pPost)!= null){
            lParadasLinea.get(clave).setPosterior(lParadasLinea.get(pPost));
        }

        //Informamos en Linea la parada y en parada la linea
        oLinea.addParadasLineas(lParadasLinea.get(clave));
        oParada.addLineas(oLinea);
    };

    public void addVeterano(String dni, String nombre, Integer noRealiza)
            throws Exception {
        if (lVeterano.get(dni) != null) throw new Exception();
        Linea lExcluida = null;
        if (noRealiza != null) lExcluida = lLineas.get(noRealiza);
        lVeterano.put(dni,new Veterano(dni, nombre, lExcluida));
    };

    public void addPracticas(String dni, String nombre)
        throws Exception {
        if (lPractica.get(dni) != null) throw new Exception();
        lPractica.put(dni,new Practicas(dni, nombre));
    };

    public void addTurno(String conductor, String tipoTurno, LocalDate Fecha,
                         String matricula) throws Exception{

    }
}
