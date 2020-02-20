package com.mycompany.interestcalculation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class CompoundInterest {
	float principleAmount,rate,time,compoundInterest;
	void readValues() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Enter Principle Amount :\n");
		bw.flush();
		principleAmount = Float.parseFloat(br.readLine());
		bw.write("Enter Rate : \n");
		bw.flush();
		rate = Float.parseFloat(br.readLine());
		bw.write("Enter Time Period : \n");
		bw.flush();
		time = Float.parseFloat(br.readLine());
	}
	void calculateCompoundInterest(){
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
	}
	void displayAmount() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Total Amount : "+compoundInterest);
		bw.flush();
	}
	

}
