package saveTheRopa;

import java.util.ArrayList;
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
        return identificador;
    }

    public void mostrarPrendas(){
        for(Map.Entry<Integer,List<Prenda>> entry:diccionario.entrySet())
        {
            Integer key = entry.getKey();
            List<Prenda> value = entry.getValue();
            System.out.println("Key="+key+", value="+value);
        }


    }
}
