package com.cogzidel.lk;


import java.util.*;

public class Sample10 {

	public static void main(String[] args) {
		//Scanner in=new Scanner(System.in);
	Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		
		int b=a,sum=0;
		int d;
		int g=1;
		while(b>0){
			d=b%10;
			b=b/10;
			sum=sum+d*g;
			++g;
		}
		System.out.println(sum);

	}

	}
