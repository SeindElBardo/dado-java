package dados;

public class Dado {//Este proyecto sirve para mejorar la generación de aleatorios junto con el sistema d20
	
	public static int tirar (int caras){
		return (int) (Math.random()*caras+1);
	}
	
	public static int tirar (int cantidad, int caras){
		int resultado = 0;
		for (int ii = 0; ii<cantidad; ii++){
			resultado= resultado + (int) (Math.random()*caras+1);
		}
		return resultado;
	}
	
	public static int random (int numeroMax){//Contiene el 0
		return (int) (Math.random()*(numeroMax+1));
	}
	
	public static int random (int numeroMin, int numeroMax){
		return (int) ((numeroMin + Math.random()*(numeroMax+1-numeroMin)));
	}
	
	public static int d20 (){
		return tirar(20);
	}
	
	public static int d100 (){
		return tirar(100);
	}
	
	public static int d12 (){
		return tirar(12);
	}
	
	public static int d10 (){
		return tirar(10);
	}
	
	public static int d8 (){
		return tirar(8);
	}
	
	public static int d6 (){
		return tirar(6);
	}
	
	public static int d4 (){
		return tirar(4);
	}
	
	public static int d2 (){
		return tirar(2);
	}
	
	public static int dPorcentaje (){
		return tirar(10)*10;
	}
}
