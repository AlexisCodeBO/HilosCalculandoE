
public class Hilo extends Thread {
	
	//variables globales
		public static int nHilos;
		public static int nElementos;
		public static double SumaTotal;
		//varialbes locales
		private int miId;
		private int miN;
		private int miInicio;
		private int miFinal;
		private double miSuma;
		
		public Hilo(int id){
			miId=id;
		}
		public static long Factorial(long a){
			long s=1;
			for(int i=1;i<=a;i++){
					s=s*i;
			}
			return s;
		}
		
		@Override
		public void run(){
			miN=nElementos/nHilos;
			
			miInicio=miId*miN;
			
			miFinal=miInicio+miN;
			
			for(int e = miInicio ;e < miFinal;e++){
				//SumaTotal=SumaTotal+signo/(2*e+1);
				miSuma =miSuma+(1/(Factorial(e+1)));
				//miSuma = e+1 / (double) (Factorial(e));
			}
			//SumaTotal=SumaTotal+miSuma;
			sumar(miSuma);
		}
		public static synchronized void sumar(double sumaIndividual){
			SumaTotal=SumaTotal+sumaIndividual;
		}
		

}
