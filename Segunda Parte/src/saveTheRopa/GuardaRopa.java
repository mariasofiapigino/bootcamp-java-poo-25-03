/**
 * SaveTheRopa S.A es una empresa que desea implementar un sistema informático de
 * guardarropas a nivel mundial. El sistema permite a una persona guardar sus pertenencias
 * en el guardarropas y luego retirarlas de manera sencilla con solo presentar el número
 * identificador que recibe al guardarlas.
 *
 * Las pertenencias se representan en el sistema mediante algo abstracto llamado prenda,
 * que tiene marca y modelo, de modo que si la persona pierde el número también podría en
 * algún momento poder llegar a reclamarlo con dicha información. Sin embargo, el reclamo
 * será modelado en otro momento.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */
package saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Map<Integer, List<Prenda>> diccionario;
    private int identificador;

    public GuardaRopa() {
        diccionario = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        diccionario.put(identificador, listaDePrenda);
        identificador ++;
        return identificador - 1;
    }

    public void mostrarPrendas(){
        for(Map.Entry<Integer,List<Prenda>> entry:diccionario.entrySet())
        {
            Integer key = entry.getKey();
            List<Prenda> value = entry.getValue();
            System.out.println("Identificador= "+key+", Prendas= "+value);
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> devuelta = diccionario.get(numero);
        diccionario.remove(numero);
        return devuelta;
    }
}
