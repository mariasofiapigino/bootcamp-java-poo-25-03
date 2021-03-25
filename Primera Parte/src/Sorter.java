/**
 * 1. Crear una interface llamada Sorter<T>, con el método abstracto public void sort(T arr[],
 * Comparator<T> c).
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

import java.util.Comparator;

public interface Sorter <T>{
    public void sort(T arr[], Comparator<T> c);
}
