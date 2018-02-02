package readinfile;
import java.io.*;
import java.util.*;

public class CoinFlipSave {
	
	static Scanner savereader;
	static int bestScore;
	static String BestName;
	static FileWriter savefile;
	static PrintWriter saver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saveFileName = "coinFlipSave";
		File file = new File("coinFlipSave.txt.txt");
		Scanner input = new Scanner(System.in);
		boolean gotHeads;
		PrintWriter saver = null;
		
		try {
			saver = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int points = 0;
		gotHeads = Math.random()> .5;
		int in;
		String answer;
		//savereader(file);
		// creates file if no file is found
		if(!file.exists()) {
			
			try {
		        FileWriter writer = new FileWriter(new File("file.txt"), false);
		        try {
		           
		            writer.write(BestName);
		            writer.write(bestScore);
		            writer.flush();
		            writer.close();
		        } catch (NumberFormatException e) {
		        }
		    } catch (IOException ex) {
		    }
		}
		
		System.out.println("Lets play coin flip! What do you want to do?");
		System.out.println("1) Play the game" + "\n2) Scoreboard");
		in = input.nextInt();
		if (in == 1) {
			
			
			System.out.println("Flip the coin, heads is a point tails is no point. Repeat until tails");
			
			float num = (float) Math.random();
			System.out.println(num);
			if (num > .5) {
				System.out.println("You got heads, you got a point");
				points = +1;
			} 
						System.out.println(points);
			System.out.println("Want to go again?");
				answer = input.next();
			if (answer.equals("yes")) {
				System.out.println("go again");
				
				System.out.println(num);
				if (num > .5) {
					System.out.println("You got heads, you got a point");
					points = +1;
				} 
			}
			if (answer.equals("no")) {
				if (bestScore < points) {
					System.out.println("You got the best score! type your name!");
					BestName = input.next(); 
					bestScore = points;
					
					saver.write(BestName);
					saver.write(bestScore);
					saver.close();
					

				System.out.println("Goodbye");
			}
			
		}
		}
		if (in == 2) {
		legend();
		}	


	if(file.exists()&&file.length()>0) {	
		System.out.println("Found a save");
}
	else {
		bestScore = -1;
		BestName = "";
	}
		
		}
		
	
	public static void savereader(String file) {
		try {
			savereader = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		BestName = savereader.next();
		bestScore = savereader.nextInt(); 
		savereader.close();
		System.out.println();
}
	public static void savefile(String BestName, int BestScore) throws FileNotFoundException {
		BestName = savereader.next();
		bestScore = savereader.nextInt(); 
		savereader.close();
		System.out.println();
	}
	public static void saver() {
		
		
		BestName = savereader.next();
		bestScore = savereader.nextInt(); 
		savereader.close();
		System.out.println();
	}
	public static void legend() {
		
		System.out.println("The highest score is " + bestScore);
		System.out.println("And was achieved by " + BestName);
		
		
	}
	
	
}
