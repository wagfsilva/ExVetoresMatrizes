/* OBJETIVO: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
				a. A média dos valores entre 10 e 200;
				b. A soma dos números ímpares.
 *AUTOR: Wagner Francisco da Silva 
 *DATA: 11/03/19
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex01
{
	public static void main(String[] args) 
	{
		int vetNum[] = new int[50];
		carregaVetor(vetNum);
		JOptionPane.showMessageDialog(null, "A méida dos valores entre 10 e 200 é: " + calculaMedia(vetNum));
		JOptionPane.showMessageDialog(null, "A soma dos números ímpares: " + calculaSoma(vetNum));
	}

	static int[] carregaVetor(int[] vet) 
	{
		int i;
		for (i = 0; i < 50; i++)
		{
			vet[i] = (int) (Math.random() * 300) + 1;
		}
		return vet;
	}

	static double calculaMedia(int[] vet)
	{
		double media = 0;
		int i;
		int aux = 0;
		for (i = 0; i < 50; i++) {
			if ((vet[i] >= 10) && (vet[i] <= 200))
			{
				media += vet[i];
				aux++;
			}
		}
		media = media / aux;
		return media;
	}

	static int calculaSoma(int[] vet)
	{
		int i;
		int soma = 0;
		for (i = 0; i < 50; i++)
		{
			if (vet[i] % 2 == 1) 
			{
				soma += vet[i];
			}
		}
		return soma;
	}
}
