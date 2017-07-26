package creepyhouse;

import java.util.Scanner;

class Creepyhouse {

	public static void main(String[] args) {
		//Variables and instantiations
		String choice="";
		Scanner scan= new Scanner(System.in);
		boolean cont=true;
		
		while(cont)
		{
		System.out.println("You Found A Creepy looking House!\n  Do you want to go 'in' or 'around'?");
		choice=scan.nextLine();

		//Level 1 choice A
		if (choice.equalsIgnoreCase("in"))
		{
			System.out.println("Do you want to go into the 'kitchen' or the 'living room'?");
			choice=scan.nextLine();
			
			//Level 2 choice A
			if(choice.equalsIgnoreCase("kitchen"))
			{
				System.out.println("Do you want to open the 'cabinet' or the 'fridge'?");
				choice=scan.nextLine();
				//Level 3 choice A
				if(choice.equalsIgnoreCase("cabinet"))
				{
					System.out.println("You see a box of crackers and a live snake!\nDo you want to grab the 'crackers' or the 'snake'?");
					choice=scan.nextLine();
					//Level 4 choice A
					if(choice.equalsIgnoreCase("crackers"))
						{
						System.out.println("Congratulations! You've found a magic wand!  It lets you teleport to anywhere you want to go");
						}
					//Level 4 choice B
					else if(choice.equalsIgnoreCase("snake"))
					{
						System.out.println("The snake turns into your fairy godmother and all your wishes come true!");
					}
				}
				//Level 3 choice B
				else if(choice.equalsIgnoreCase("fridge"))
				{
					System.out.println("Do you want to grab the 'ice cream' or the 'milk'?");
					choice=scan.nextLine();
					//Level 4 choice C
					if(choice.equalsIgnoreCase("ice cream"))
					{
						System.out.println("It's poisoned and you die.");
					}
					//Level 4 choice D
					else if(choice.equalsIgnoreCase("milk"))
					{
						System.out.println("You drink the rest of the milk.  Now there's no milk left for the rest of your life.");
					}
				}
			}
			//Level 2 choice B
			else if(choice.equalsIgnoreCase("living room"))
			{
				System.out.println("Do you want to go into the 'dining' area or the 'entertainment' area?");
				choice=scan.nextLine();
				//Level 3 choice A
				if(choice.equalsIgnoreCase("dining"))
				{
					System.out.println("Do you want to eat 'lunch' or 'clean'?");
					choice=scan.nextLine();
					//Level 4 choice A
					if(choice.equalsIgnoreCase("lunch"))
					{
						System.out.println("You won't be hungry for the rest of your life!");
					}
					//Level 4 choice B
					else if(choice.equalsIgnoreCase("clean"))
					{
						System.out.println("You find a treasure box.  What's in it?  Whatever you want!");
					}
				}
				//Level 3 choice B
				else if (choice.equalsIgnoreCase("entertainment"))
				{
					System.out.println("Do you want to 'watch' movies or 'sing' karaoke");
					choice=scan.nextLine();
					//Level 4 choice A
					if(choice.equalsIgnoreCase("watch"))
					{
						System.out.println("The only movie is a sad movie.  You cry.");
					}
					//Level 4 choice B
					else if(choice.equalsIgnoreCase("sing"))
					{
						System.out.println("You can't stop singing.  Your throat hurts.");
					}
				}
			}
		}
		//Level 1 choice B
		else if(choice.equalsIgnoreCase("around"))
		{
			System.out.println("You fall into the basement.  Do you want to go up the 'stairs' or through the 'door'?");
			choice=scan.nextLine();
			if(choice.equalsIgnoreCase("stairs"))
			{
				System.out.println("The stairs end at a wooden door.  You open in and see a hallway going both ways.  Do you want to go 'right' or 'left'?");
				choice=scan.nextLine();
				if(choice.equalsIgnoreCase("right"))
				{
					System.out.println("You finally get to the end of the hall.  There's a small table with a stack of money and a book on it.  Do you take the 'money' or the 'book'?");
					choice=scan.nextLine();
					if(choice.equalsIgnoreCase("money"))
					{
						System.out.println("An axe swings out of the ceiling and decapitates you.  Swiper no swiping.");
					}
					else if(choice.equalsIgnoreCase("book"))
					{
						System.out.println("It's a map of the house.  You escape safely and live happily ever after.");
					}
				}
				else if(choice.equalsIgnoreCase("left"))
				{
					System.out.println("The hallway seems to go on forever.  Do you want to 'keep going' or 'turn around'?");
					choice=scan.nextLine();
					if(choice.equalsIgnoreCase("keep going"))
					{
						System.out.println("It actually does go on forever.  You starve.  Or die of dehydration.  Or something.");
					}
					else if(choice.equalsIgnoreCase("turn around"))
					{
						System.out.println("It actually does go on forever.  You never find the stairs.  You starve.  Or die of dehydration.  Or something.");
					}
				}
			}
			else if(choice.equalsIgnoreCase("door"))
			{
				System.out.println("It's locked.  Do you want to try the 'key' hanging next to it or the 'axe'?");
				choice=scan.nextLine();
				if(choice.equalsIgnoreCase("key"))
				{
					System.out.println("The key fits and you unlock the door. Are your thoughts 'happy' or 'scared'?");
					choice=scan.nextLine();
					if(choice.equalsIgnoreCase("happy"))
					{
						System.out.println("You see a lamppost through the forest in front of you and you go to it.");
					}
					else if(choice.equalsIgnoreCase("scared"))
					{
						System.out.println("You feel someone kick you through the door into blackness and hear the door lock behind you.  A voice says \"Oh good.  Another one.  I'm hungry!\"");
					}
				}
				else if(choice.equalsIgnoreCase("axe"))
				{
					System.out.println("Your hands hurt, but you're through the door.  Something flies at you.  Do you 'swing' the axe at it or 'jump' out of the way?");
					choice=scan.nextLine();
					if(choice.equalsIgnoreCase("swing"))
					{
						System.out.println("The monster falls dead to the floor.  You go back to the hole in the floor and climb out.  No one will ever believe you.");
					}
					else if(choice.equalsIgnoreCase("jump"))
					{
						System.out.println("The cat runs past you.  You follow it out and away from the house.");
					}
				}
			}
		}
		System.out.println("Do you want to try again? (y/n)");
		choice=scan.nextLine();
		if(choice.equalsIgnoreCase("n"))
		{
			cont=false;
			System.out.println("no "+cont+ " "+choice);
		}
		else if (!choice.equalsIgnoreCase("y"))
		{
			System.out.println("That wasn't an option.  Back to the creepy house you go!");
		}
	}
		
	}
	
}
