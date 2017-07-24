//Tangy F. Commission Calculator 
//7*16*17

package com.cre8tivedevs;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CommissonCalc1 {
String name;
int credits,cmg,profit,rate, amount;
	public static void main(String[] args) {
		//return the methods add objects
		CommissonCalc1 obj = new CommissonCalc1();
		obj.inputClient();
		obj.inputRate();
		obj.calculation();
	}
	Scanner keyboard=new Scanner(System.in);
	// METHOD- Client Info
	public void inputClient(){

		name = JOptionPane.showInputDialog("Clients Name ");
		//String name= keyboard.nextLine();
		//System.out.println(name);
	}
	//METHOD Rate
	public void inputRate(){
		System.out.println(" \n Enter the rate");
		//float rate= keyboard.nextFloat();
		//System.out.println(rate);
	}
	//METHOD calculation
	public void calculation(){
		System.out.println(" Enter Amount");;
		//float amount=keyboard.nextFloat();
		System.out.println("Enter Credits");
		float credits=keyboard.nextFloat();	
		System.out.println("Enter CMG");
		float cmg=keyboard.nextFloat();
		
		float profit=0;
		profit= amount - credits * cmg;
		
		System.out.println( "$" +profit +"Is your TR Profit \n"  );
		System.out.println("$" +profit / 2 + " Is the 50/50 split");
	}
	
}
