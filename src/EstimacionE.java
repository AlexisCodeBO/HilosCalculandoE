
public class EstimacionE {

	public static void main(String[] args) throws InterruptedException {
		
		Hilo.nHilos=Integer.parseInt(args[0]);
		Hilo.nElementos=Integer.parseInt(args[1]);
		
		Hilo[] hilos =new Hilo[Hilo.nHilos];
		
		for(int h=0;h<Hilo.nHilos;h++){
			hilos[h]=new Hilo(h);
		}
		
		long ti=System.currentTimeMillis();
		
		for(int h=0;h<Hilo.nHilos;h++){
			hilos[h].start();
		}
		
		for(int h=0;h<Hilo.nHilos;h++){
			hilos[h].join();
		}
		long tf=System.currentTimeMillis();
		System.out.printf("El valor de e es: %.16f%n",1+Hilo.SumaTotal);
		System.out.printf("El procesamiento tomo: %d ms%n ", (tf-ti));
		
		long a= Hilo.Factorial(3);
		System.out.print(a);
	}

}
