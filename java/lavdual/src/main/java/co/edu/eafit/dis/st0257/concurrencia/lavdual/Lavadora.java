package co.edu.eafit.dis.st0257.concurrencia.lavdual;

import java.util.Random;

/**
 * Esta clase simula el comportamiento de una de las lavadoras
 * que van a trabajar de manera dual.
 */
public class Lavadora implements Runnable {

    // Agente de sincronización
    private Sincronizador agenteSin;
    private GenCargas genCargas;
    private Random random;

    public Lavadora(Sincronizador agenteSin,
		    GenCargas genCargas) {

	this.agenteSin = agenteSin;
	this.genCargas = genCargas;
    }

    /**
     * lavar - se encarga de realizar el lavado
     */
    public void lavar() {
    }

    /**
     *run se encarga de ejecutar el proyecto
     */
    public void run() {

	int cap = 0;

	while (true) {

	    cap = genCargas.obtenerSigCarga();
	    agenteSin.arrancar(cap);
	    lavar();
	    agenteSin.parar(cap);
	}
    }
}
