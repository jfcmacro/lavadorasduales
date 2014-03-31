import co.edu.eafit.dis.st0257.concurrencia.lavdual.Lavadora;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.Sincronizador;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.GenCargas;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.SincronizadorImpl;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.GenCargasImpl;

public class PrincipalLavadorasDual {

   public static void usage() {
      System.err.println("Usage: java PricipalLavadoraDual maxCarga");
      System.exit(1);
   }

   public static void main(String args[]) {

      if (args.length != 1) {
         usage();
      }

      int maxCarga = Integer.parseInt(args[0]);

      GenCargas genCargas = new GenCargasImpl(maxCarga);
      Sincronizador agenteSin = new SincronizadorImpl();

      Lavadora lavadoraA = new Lavadora(agenteSin, genCargas);
      Lavadora lavadoraB = new Lavadora(agenteSin, genCargas);

      Thread hiloLavA = new Thread(lavadoraA);
      Thread hiloLavB = new Thread(lavadoraB);
      hiloLavA.start();
      hiloLavB.start();

      try {
         hiloLavA.join();
      } catch(InterruptedException ie) { }
   }
}
