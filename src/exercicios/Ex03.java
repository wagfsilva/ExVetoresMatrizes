/*OBJETIVO: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar
		 	esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
		 	VT1| 1| 2| 3| 			VT2| 4| 5| 6| 				VT3| 1| 2| 3| 4| 5| 6
 *AUTOR: Wagner Francisco da Silva
 *DATA: 12/03/19
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex03 
{
		static 	int vet1[] = new int [3];
		static  int vet2[] = new int [3];
		public static void main(String[] args)
		{
			int vet3[] = new int[6];
			carregaVetor(vet1, vet2);
			concatenaVetor(vet1, vet2, vet3);
			mostraVetor(vet3);
		}
		
		static void carregaVetor(int[] vet1, int[] vet2)
		{
			int i;
			for(i = 0; i < 3; i++)
			{
				vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a "+(i+1)+
						"º posição do vetor A"));
				vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a "+(i+1)+
						"° posição do vetor B"));
			}
		}
		
		static int[] concatenaVetor (int[] vet1, int[] vet2, int[] vet3)
		{
			int i;
			for(i = 0; i < 3; i++)
			{
				vet3[i] = vet1[i];
			}
			
			for(i = 0; i < 3; i++)
			{
				vet3[i + 3] = vet2[i];
			}
			return vet3;
		}
		
		static void mostraVetor(int[] vet3)
		{
			int i;
			System.out.println("Vetores concatenados: ");
			for(i = 0; i < 6; i++)
			{
				System.out.println(vet3[i]);
			}
		}
	}