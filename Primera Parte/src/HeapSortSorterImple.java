/**
 * 2. Crear una clase llamada HeapSortSorterImple que implemente la interface (en T)
 * anterior y sobreescriba el método sort (dejarlo vacío por el momento).
 * 3. Buscar en Internet alguna implementación del algoritmo de ordenamiento HeapSort
 * (por ejemplo, usar las palabras: HeapSort.java) y utilizarlo para programar el método
 * sort del punto anterior, haciendo las modificaciones que sean necesarias.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i, c);

        for (int i = n - 1; i > 0; i--) {
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0, c);
        }
    }

    void heapify(T[] arr, int n, int i, Comparator<T> c)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && c.compare(arr[l], arr[largest]) > 0)
            largest = l;

        if (r < n && c.compare(arr[r], arr[largest]) > 0)
            largest = r;

        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest, c);
        }
    }


}
