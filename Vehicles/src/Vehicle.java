
public class Vehicle {
   public Vehicle(int cilindrada, int portes, int velocidad_actual) {
		this.cilindrada = cilindrada;
		this.portes = portes;
		this.velocidad_actual = 0;
	}

private int cilindrada;
   private int portes;
   private int velocidad_actual;
   private static final int VELOCIDAD_MAXIMA=120;
   
   public void acelerar() {
	   if(velocidad_actual<VELOCIDAD_MAXIMA) {
		   velocidad_actual=velocidad_actual+10;
	   }
	   else {
		   velocidad_actual=VELOCIDAD_MAXIMA;
	   }
	   
   }
}
