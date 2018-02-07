/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author kenji
 */
public class Calculator {

	public double get_nr(char[] sir,int a, int b){
		double nr = 0, rn = 0;
		byte r = 1;
		boolean v = false;
		for(int i = a; i < b; i++){
			if(sir[i] == ','){
				v = true;
				continue;
			}
			if (v){
				rn = rn*10 + sir[i] - 48;
				r *= 10;
			}
			else
				nr = nr*10 + sir[i] - 48;
		}
		if (r != 1)
			nr += rn/r;
		return nr;
	}

	//private byte[] setPrior(char[] sir){
	private byte[] setPrior(char[] sir){
		byte[] op = new byte[sir.length];
		for(int i = 0; i < sir.length; i++){
			if(sir[i] == '+' || sir[i] == '-') {op[i] = 1; continue;}
			if(sir[i] == '*' || sir[i] == '/') {op[i++] = 2; continue;}
			op[i] = 0;
		}
		return op;
	}

	public byte[] getter(char[] sir){
		byte[] bir = setPrior(sir);
		return bir;
		//return get_nr(sir, 3,3 +lsPos(bir,2));
	}

	private int stPos(byte[] sir, int p){
		int c = 0; p--;
		while(p >= 0 && sir[p--] == 0)
			c++;
		
		return c;
	}

	private int lsPos(byte[] sir, int p){
		int c = 0; p++;
		while(p <sir.length&& sir[p++] == 0)
			c++;
		return c;
	}

	private static int max = 0;
	private static int posMax = 0;
	private double solvPrior(byte[] bir, char[] sir, int p, int max){
		int i;
		/*
			ciclu recursiv
		*/
		for(i = p; i < bir.length; i++){
			if(bir[i] > max){
				int aux = bir[i] - max;
				bir[i] = -1;
				posMax = i;
				System.out.println(i);
				if(sir[i] == '+')
					return get_nr(sir,i-stPos(bir,i), i) + solvPrior(bir,sir,i+1+lsPos(bir,i), max + aux);
				if(sir[i] == '-')
					return get_nr(sir,i-stPos(bir,i), i) - solvPrior(bir,sir,i+1+lsPos(bir,i), max + max);
				if(sir[i] == '*')
					return get_nr(sir,i-stPos(bir,i), i) * solvPrior(bir,sir,i+1+lsPos(bir,i), max + max);
				if(sir[i] == '/')
					return get_nr(sir,i-stPos(bir,i), i) / solvPrior(bir,sir,i+1+lsPos(bir,i), max + max);
			}
		}
		return  get_nr(sir,posMax+1,posMax+1+lsPos(bir,posMax));
	}

	public double operatie(String str){
		char[] sir = str.toCharArray();
		byte[] bir = setPrior(sir);
		int i = 1;
		while ( i < bir.length && bir[i++] == 0){ }
		return solvPrior(bir, sir, i, 0);
	}
}
