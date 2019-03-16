/*OBJETIVO: Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
*AUTOR: Wagner Francisco da Silva
*DATA: 14/03/19
*/

package exercicios;

public class Ex05 
{
	public static void main(String[] args) 
	{
		int vetNum[] = new int [20];
		carregaVetor(vetNum);
		ordenaVetor(vetNum);
		mostraVetor(vetNum);
	}
	
	static int[] carregaVetor(int [] vet)
	{
		int i;
		for(i = 0; i < 20; i++)
		{
			vet[i] = (int)(Math.random()*100)+1;
		}
		
		return vet;
	}
	
	static int[] ordenaVetor(int[] vet)
	{
		int i,j, aux;
		for(i = 0; i < 20; i++)
		{
			for(j = 0; j < 19; j++)
			{
				if(vet[j] > vet[j + 1])
				{
				    aux = vet[j];
	                vet[j] = vet[j+1];
	                vet[j+1] = aux;
				} 
			}
		}
		return vet;
	}
	
	static void mostraVetor(int[] vet)
	{
		int i;
		for(i = 0; i < 20; i++)
		{
			System.out.println("Vetor Ordenado: "+vet[i]);
		}
	}
}