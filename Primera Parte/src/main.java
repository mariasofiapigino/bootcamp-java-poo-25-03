import com.sun.jdi.IntegerValue;

import java.io.IOException;
import java.util.Comparator;

public class main {
    public static void mostrar(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        System.out.println("- Prueba HeapSort - ");
        Integer[] iArr = {6,3,5,1,8,2,9,7,4};
        HeapSortSorterImple<Integer> heapSortSorterImple = new HeapSortSorterImple<>();
        Comparator<Integer> c1 = (a, b) -> a - b;
        heapSortSorterImple.sort(iArr, c1);
        mostrar(iArr);

        System.out.println("- Prueba QuickSort - ");
        String[] sArr = {"Hola","Holaaaaa","H","Hoo"};
        QuickSortSorterImple<String> quickSortSorterImple = new QuickSortSorterImple<>();
        Comparator<String> c2 = (a, b) -> a.length() - b.length();
        quickSortSorterImple.sort(sArr, c2);
        mostrar(sArr);

        System.out.println(" - Programa Sorter - ");
        Integer[] iArrProgr = {6,33,5,41,8,662,9777,7,4};
        String[] sArrProgr = {"Hola","Holaaaaa","H","Hoo","Holissss"};

        Sorter obj = (Sorter) MiFactory.getInstance("MiFactory.properties");
        obj.sort(iArrProgr, c1);
        obj.sort(sArrProgr, c2);
        System.out.println(" - Integer Array - ");
        mostrar(iArrProgr);
        System.out.println(" - String Array - ");
        mostrar(sArrProgr);

        Integer[] iArrBig = new Integer[100000];
        for (int i = 0; i < iArrBig.length; i++) {
            iArrBig[i] = (i + 50) * 2;
        }

        Timer timer = new Timer();
        timer.start();
        obj.sort(iArrBig, c1);
        timer.stop();
        System.out.println("Tiempo: " + timer.elapsedTime());







    }
}
