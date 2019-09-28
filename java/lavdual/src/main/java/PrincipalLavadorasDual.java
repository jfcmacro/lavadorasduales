import co.edu.eafit.dis.st0257.concurrencia.lavdual.Lavadora;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.Sincronizador;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.GenCargas;
// import co.edu.eafit.dis.st0257.concurrencia.lavdual.SincronizadorImpl;
import co.edu.eafit.dis.st0257.concurrencia.lavdual.GenCargasImpl;

public class PrincipalLavadorasDual {

   public static void usage() {
      System.err.println("Usage: java PricipalLavadoraDual maxCarga p classname");
      System.exit(1);
   }

   public static void main(String args[]) {

      if (args.length != 3) {
         usage();
      }

      try {
	  int maxCarga = Integer.parseInt(args[0]);
	  Double p = Double.parseDouble(args[0]);

	  String className = args[1];

	  GenCargas genCargas = new GenCargasImpl(maxCarga);

	  Class<?> sinclass = Class.forName(className);

	  Sincronizador agenteSin = null; //sinclass.<Sincronizador>newInstance();

	  Lavadora lavadoraA = new Lavadora(agenteSin, genCargas, p);
	  Lavadora lavadoraB = new Lavadora(agenteSin, genCargas, 1.0 - p);

	  Thread hiloLavA = new Thread(lavadoraA);
	  Thread hiloLavB = new Thread(lavadoraB);
	  hiloLavA.start();
	  hiloLavB.start();

	  try {
	      hiloLavA.join();
	  } catch(InterruptedException ie) { }
      } catch (ClassNotFoundException cnf) {
	  System.err.println("Error: " + cnf);
	  System.exit(1);
      }
   }
}
