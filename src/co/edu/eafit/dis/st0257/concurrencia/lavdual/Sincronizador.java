package co.edu.eafit.dis.st0257.concurrencia.lavdual;

public interface Sincronizador {

    /**
     * arracar - se encarga de iniciar la ejecución de una
     *           lavadora.
     * @param cap determina la capacidad inicial de la lavadora.
     */
    public void arrancar(int cap);


    /**
     * parar - se encarga de parar la ejecución de una 
     *         lavadora.
     * @param cap determina la capacidad de terminar la lavadora.
     */
    public void parar(int cap);
}
