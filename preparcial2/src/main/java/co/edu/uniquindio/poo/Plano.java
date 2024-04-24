package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Plano {

    /**
     * Metodo para ordenar - funcional
     * @param figuras
     * @return
     */
    public static Collection<Figura> ordenar(Collection<Figura> figuras){
        var comparador = Comparator.comparing(Figura::calcularArea);
        return figuras.stream().sorted(comparador).toList();
    }

    /**
     * Metodo para ordenar iterativo 
     * @param figuras
     * @return
     */
    public static Collection<Figura> ordenarFigura(Collection<Figura> figuras){
        List<Figura> listaNueva = new LinkedList<>(figuras);
        for(int i = 0; i < listaNueva.size(); i++){
            for(int j = i + 1; j < listaNueva.size(); j++){
                if(listaNueva.get(i).calcularArea() > listaNueva.get(j).calcularArea()){
                    Figura aux = listaNueva.get(i);
                    listaNueva.set(i, listaNueva.get(j));
                    listaNueva.set(j, aux);
                }
            }
        }
        return listaNueva;
    }
    
}
