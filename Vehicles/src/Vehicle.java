
public class Vehicle {
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
   public void desacelerar() {
	   if(velocidad_actual>0) {
		   velocidad_actual=velocidad_actual-10;
	   }
	   else {
		   velocidad_actual=0;
	   }
   }
}
