/**
 * Crear una clase llamada Timer, con dos métodos: start y stop, que respectivamente
 * guardan en variables de instancia la hora actual expresada en milisegundos
 * (investigar cómo hacerlo).
 * Agregar a la clase Timer el método elapsedTime que retorna el tiempo transcurrido
 * entre el tiempo de inicio (start) y el de fin (stop).
 *
 * @author  Sofia Pigino (Grupo 1)
 * @version 1.0
 */

public class Timer {
    private long startTime;
    private long stopTime;

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return stopTime - startTime;
    }
}
