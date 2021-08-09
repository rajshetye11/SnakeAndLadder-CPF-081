package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadderComputation 
{
	public static void main(String[] args) {

		System.out.println("Welcome To Snake and Ladder");
		
		String player1 = "Raj";
		int position = 0, start_position = 0, max_position = 100;
		
		
		System.out.println();
		System.out.println("Name of the Player : "+player1);			//UC1
		System.out.println("Starting Position : " +start_position);		//UC1
		System.out.println("End Position : " +max_position);			//UC1
		System.out.println("Player Position : " +position);             //UC1
		
		Random random = new Random();
		
		while (position >= 0 && position <100) {
			int dice = random.nextInt(6)+1; 
			int option = random.nextInt(3);
						
			System.out.println("Dice rolled : " +dice ); 
			
			switch(option)
			{
				case 0:
					System.out.println("Option : " +option);
					System.out.println("NoPlay");
					
					break;
				case 1:
					System.out.println("Option : " +option);
					System.out.println("Ladder"); 
					if (position + dice > 100)
					{ 
						position=position;
						
					}else
					{
						position += dice;
						
					}
					break;	
				case 2:
					System.out.println("Option : " +option);
					System.out.println("Snake");
					if( position - dice < 0)
					{
						position = 0;
						
					}else
					{
						position -= dice;
						
					}
					break;	
				
			}
			System.out.println("Position : " +position);
		
			
		}
		


	}
	
}
