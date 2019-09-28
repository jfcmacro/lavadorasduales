package co.edu.eafit.dis.st0257.concurrencia.lavdual;

public class AgenteVoid implements Sincronizador {

    /**
     * arracar - se encarga de iniciar la ejecución de una
     *           lavadora.
     * @param lavadoraID determina quien pone una carga
     * @param cap        determina la capacidad inicial de la lavadora.
     */
    @overwrite
    public void arrancar(LavadoraID lavadoraID, int cap) {
	// ToDo This must be implemented
    }


    /**
     * parar - se encarga de parar la ejecución de una
     *         lavadora.
     * @param lavadoraID determina quien pone un carga.
     */
    @overwrite
    public void parar(LavadoraID lavadoraID) {
	// ToDo This must be implemented
    }
}
