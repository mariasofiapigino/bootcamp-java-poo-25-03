/**
 * 2. Crear una clase llamada BubbleSortSorterImple que implemente la interface (en T)
 * anterior y sobreescriba el método sort (dejarlo vacío por el momento).
 * 3. Buscar en Internet alguna implementación del algoritmo de ordenamiento BubbleSort
 * (por ejemplo, usar las palabras: BubbleSort.java) y utilizarlo para programar el método
 * sort del punto anterior, haciendo las modificaciones que sean necesarias.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(Object[] arr, Comparator c) {
        for(int j=0; j<arr.length; j++){
            for(int i=0; i<arr.length-1; i++){
                if( c.compare(arr[i],arr[i+1])>0 ){
                    Object aux=arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
    }
}
