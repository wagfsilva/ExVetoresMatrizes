/* OBJETIVO: Criar e coletar um vetor [100] inteiro e exibir:
				a. O maior e o menor valor;
				b. A média dos valores.
 *AUTOR: Wagner Francisco da Silva
 *DATA: 11/03/19
*/

package exercicios;

import javax.swing.JOptionPane;

public class Ex02 
{
	static int maior, menor;

	public static void main(String[] args) 
	{
		int vetNum[] = new int[100];
		carregaVetor(vetNum);
		verificaMaior(vetNum);
		JOptionPane.showMessageDialog(null, "A média dos valores: " + calculaMedia(vetNum));
	}

	static int[] carregaVetor(int[] vet)
	{
		int i;
		for (i = 0; i < 100; i++) {
			vet[i] = (int) (Math.random() * 100) + 1;
			maior = vet[i];
			menor = vet[i];
		}
		return vet;
	}

	static void verificaMaior(int[] vet)
	{
		int i;
		for (i = 0; i < 100; i++) 
		{
			if (vet[i] > maior) 
			{
				maior = vet[i];
			} else 
				if (vet[i] < menor)
			{
				menor = vet[i];
			}

		}
		JOptionPane.showMessageDialog(null, "O maior valor é: " + maior + "\n O menor valor é: " + menor);
	}

	static double calculaMedia(int[] vet) 
	{
		int i;
		double media = 0;
		for (i = 0; i < 100; i++) 
		{
			media += vet[i];
		}
		media /= 100;
		return media;
	}
}
