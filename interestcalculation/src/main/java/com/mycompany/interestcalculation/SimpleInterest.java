package com.mycompany.interestcalculation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class SimpleInterest {
	float principleAmount,rate,time,simpleInterest;
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
	void calculateSimpleInterest(){
		simpleInterest = (principleAmount * rate * time)/100;
	}
	void displayAmount() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Total Amount : "+simpleInterest);
		bw.flush();
	}
}


