/**
 * Crear la clase MiFactory con el método public static Object getInstance(String objName).
 *  a. Usando la clase Properties (investigar) leer el contenido de la propiedad
 *  “sorter” del archivo creado en (6), que en este caso será la cadena:
 *  “paquete.QuickSortSorterImple”.
 *  b. Usando la clase Class (investigar) crear dinámicamente un objeto del tipo
 *  obtenido en (8) y retornarlo.
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties prop = readPropertiesFile(objName);
        return Class.forName(prop.getProperty("sorter")).newInstance();
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(IOException fnfe) {
            fnfe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }
}
