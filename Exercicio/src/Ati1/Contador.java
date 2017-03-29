package Ati1;
import java.util.Random;
public class Contador {

	public void calculo() {
		int vetor [] = new int [10];
		
		Random random = new Random ();
		int cont = 0;
		for (int i = 0;i<= 4; i ++){
			vetor[i]= random.nextInt(1);
			cont++;
		}
       System.out.println("Tamanho do Vetor :"+ vetor.length +"\n Tamanho do contador :" + cont);
	}

	
	}


