/*OBJETIVO: 4. Criar e coletar em um vetor [30] real e calcular e exibir: 
				a. A média do grupo; 
				b. A quantidade de notas acima do grupo; 
				c. As posições dos valores abaixo da média do grupo.
AUTOR: Wagner Francisco da Silva
DATA: 14/03/19 
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex04 
{
	static  double media;
	public static void main(String[] args) 
	{
		int vetNotas[] = new int [30];
		carregaVetor(vetNotas);
		JOptionPane.showMessageDialog(null, "A média do grupo é: "+calculaMedia(vetNotas));
		JOptionPane.showMessageDialog(null, "Quantidade de notas acima da média de grupo: "+verificaNotas(vetNotas, media)+ " notas.");
		
	}
	
	static int[] carregaVetor(int[] vet)
	{
		int i;
		for(i = 0; i < 30; i++)
		{
			vet[i] = (int)(Math.random()*10)+1;
		}
		
		return vet;
	}
	
	static double calculaMedia (int[] vet)
	{
		int i;
		for(i = 0; i < 30; i++)
		{
			media += vet[i]; 
		}
		media /= 30;
		
		return media;
	}
	
	static int verificaNotas (int[] vet, double media)
	{
		int i;
		int notas = 0;
		System.out.println("Notas abaixo da média do grupo: ");
		for(i = 0; i < 30; i++)
		{
			if(vet[i] > media)
			{
				notas++;
			}
			else
				if(vet[i] < media)
			{
				System.out.println(vet[i]);
			}
		}
		return notas;
	}

}
