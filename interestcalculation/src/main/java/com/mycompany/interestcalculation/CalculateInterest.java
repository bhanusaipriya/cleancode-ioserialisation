package com.mycompany.interestcalculation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class CalculateInterest 
{
    public static void main( String[] args ) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("Choose either option 1 or 2 :"+"\n");
    	bw.write("1.Simple Interest"+"\n");
    	bw.write("2.Compound Interest"+"\n");
    	bw.flush();
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int choice = Integer.parseInt(br.readLine());
    	switch(choice){
    		case 1:simpleInterest.readValues();
    			   simpleInterest.calculateSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readValues();
			   compoundInterest.calculateCompoundInterest();
			   compoundInterest.displayAmount();
			   break;
			default:bw.write("Please Enter Valid Option!");
    	}
    	bw.flush();
    }
}