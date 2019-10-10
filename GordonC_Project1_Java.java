import java.util.*;
import java.io.*;

public class GordonC_Project1_Java{
	public static void main(String[] args){
		int index;
		int[] count = new int[256];

		for(int i = 0; i < count.length; i++)
			count[i] = 0;		//setting each character count to zero
		try{
			Scanner inFile1 = new Scanner(new FileReader(args[0]));

            		while (inFile1.hasNextLine()){
                		String line         = inFile1.nextLine();
                		Scanner lineParser  = new Scanner(line);
                
                		while(lineParser.hasNext()){
                    			String tokenCheck  = lineParser.next();
					for(int i = 0; i < tokenCheck.length(); i++){
						index = (int) tokenCheck.charAt(i);
						if(index >= 0 && index <= 255)
							count[index] += 1;	// calculating the frequency of each character
					}
               			}
			}
			inFile1.close();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

			for(int i = 0; i < count.length; i++){
				if(count[i] > 0){
					writer.write( (char)i + "\t" + count[i]);
					writer.newLine();
				}
			}
			writer.close();
		}
		catch(IOException| IllegalArgumentException e){} 
	}
}


	