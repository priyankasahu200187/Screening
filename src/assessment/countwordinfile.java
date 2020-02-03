package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countwordinfile {
	
	
	public static int ReadInputFile(String line,String word){

		String readline;
		String[] words=null;
		BufferedReader br=null;
		int count =0;

		try{



		FileReader fr=new FileReader(line);		//reading the file to search word java
		br=new BufferedReader(fr);

		readline=br.readLine();

		while(readline!=null){

			
			//System.out.println(readline);
		words=readline.split(" ");

			for (String w: words){				//stored the words in a line in the array and then validating if "Java" is present 

				if (w.equals(word)){
					
					count=count+1;
					}
						}
		readline=br.readLine();			//readng next line in the file
					}

		br.close();//closing the file reader pointer

				//returning the total count of the word in a file

		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		return count;

	}


}
