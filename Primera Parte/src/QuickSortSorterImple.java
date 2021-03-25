/**
 * 2. Crear una clase llamada QuickSortSorterImple que implemente la interface (en T)
 * anterior y sobreescriba el método sort (dejarlo vacío por el momento).
 * 3. Buscar en Internet alguna implementación del algoritmo de ordenamiento QuickSort
 * (por ejemplo, usar las palabras: QuickSort.java) y utilizarlo para programar el método
 * sort del punto anterior, haciendo las modificaciones que sean necesarias.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */


import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{
    private Comparator<T> c;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.c = c;
        quicksort(arr, 0, arr.length - 1);
    }

    public void quicksort(T A[], int izq, int der) {
        T pivote=A[izq];
        int i=izq;
        int j=der;
        T aux;

        while(i < j){
            while(c.compare(A[i],pivote) <= 0 && i < j) i++;
            while(c.compare(A[j],pivote) > 0) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];
        A[j]=pivote;

        if(izq < j-1)
            quicksort(A,izq,j-1);
        if(j+1 < der)
            quicksort(A,j+1,der);
    }
}
