/***********************************************
 ** Simple class created to be used for user   **
 ** interaction with various cases             **
 ** Programmed by Mathew Boston 			   **
 ** Last modified July 18, 2014                **
 ** Report bugs to me                          **
 ************************************************/

import java.util.Scanner;

public class UserInteraction {

	private Scanner sc;
	private int response;

	public UserInteraction(){}

	public int askUser(){

		while(true){
			sc = new Scanner(System.in);
			try{
				response = sc.nextInt();
				return response;
			}
			catch(Exception e){
				System.out.println("That is not a valid integer! Try Again.");
				continue;
			}
		}
	}

	public String askUserString(){

		sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public int askUser(int lower){

		response = askUser();
		if(response<lower){
			System.out.println("Interger is less than "+lower+"! Try Again.");
			return askUser(lower);
		}
		else
			return response;
	}

	public int askUser(int lower, int upper){

		response = askUser();
		if(response<lower){
			System.out.println("Interger is less than "+lower+"! Try Again.");
			return askUser(lower,upper);
		} 
		if(response>upper) {
			System.out.println("Interger is greater than "+upper+"! Try Again.");
			return askUser(lower,upper);
		}
		else
			return response;
	}

	public boolean askUser(char first, char second){

		while(true){
			sc = new Scanner(System.in);
			try{
				char temp = sc.next(".").charAt(0);
				if(Character.toUpperCase(temp) == first) return true;
				if(Character.toUpperCase(temp) == second) return false;
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("Please choose either "+first+" or "+second+". Try Again.");
				continue;
			}
		}
	}
	
	public int askUser(int lower, int upper, char option){

		while(true){
			sc = new Scanner(System.in);
			try{
				char temp = sc.next(".").charAt(0);
				if(Character.toUpperCase(temp) == option) return upper+1;
				response = Character.getNumericValue(temp);
				if(response<lower || response>upper) throw new Exception();
				else return response;				
			}
			catch(Exception e){
				System.out.println("Please choose either "+option+" or an integer from "+lower+" to "+upper+", Try Again.");
				continue;
			}
		}
	}
	public int askUser(int lower, int upper, char option, char option2){

		while(true){
			sc = new Scanner(System.in);
			try{
				char temp = sc.next(".").charAt(0);
				if(Character.toUpperCase(temp) == option) return upper+1;
				if(Character.toUpperCase(temp) == option2) return upper+2;
				response = Character.getNumericValue(temp);
				if(response<lower || response>upper) throw new Exception();
				else return response;				
			}
			catch(Exception e){
				System.out.println("Please choose either "+option+"/"+option2+" or an integer from "+lower+" to "+upper+", Try Again.");
				continue;
			}
		}
	}
}