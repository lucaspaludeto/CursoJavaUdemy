package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class exercicio {
	
	public static void main(String[] args) {
		
		double[] NotasAlunosA = new double[4];
		System.out.println(Arrays.toString(NotasAlunosA));
		
		NotasAlunosA [0] = 7.9;
		NotasAlunosA [1] = 8;
		NotasAlunosA [2] = 6.7;
		NotasAlunosA [3] = 9.7;
		
		System.out.println(Arrays.toString(NotasAlunosA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < NotasAlunosA.length; i++) {
			totalAlunoA += NotasAlunosA[i];		
		}
		
		System.out.println(totalAlunoA / NotasAlunosA.length);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalALunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalALunoB += notasAlunoB[i];
		}
		
		System.out.println(totalALunoB / notasAlunoB.length);
	}

}
