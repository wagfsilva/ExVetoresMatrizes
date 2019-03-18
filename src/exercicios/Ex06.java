/*OBJETIVO: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal 
 * terá seus dados carregados no programa sendo múltiplos de 4.
 * AUTOR:Wagner Francisco da Silva
 * DATA: 18/03/19
 */
package exercicios;

public class Ex06
{
	public static void main(String[] args)
	{
		int mt[][] = new int[4][4];
		carregaMatriz(mt);
		mostraMatriz(mt);
	}
	
	static int[][] carregaMatriz(int[][] mt)
	{
		int i, j;
		for(i = 0; i < 4; i++)
		{
			for(j = 0; j < 4; j++)
			{
				if(i == j)
				{
					mt[i][j] = (int)Math.pow(4, i);
				}else
				{
				mt[i][j] = (int) (Math.random()*100)+1;
				}
			}
		}
		return mt;
	}
	
	static int[][] mostraMatriz(int[][]mt)
	{
		int i, j;
		for (i = 0; i < 4; i++)
		{
			for(j = 0; j <4; j++) 
			{
				System.out.println("Linha: "+mt[i]+"Coluna: "+mt[j]);
			}
		}
		return mt;
	}

}
