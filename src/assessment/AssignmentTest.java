package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int countword;
		int totalcount=0;
		BufferedReader reader=null;    //reference to read path of the file in inputfile
		String Line;              // realtive path of the file
		String word="java";       // word to be searched


		try{					//this is used to execute code if the exception occurs on file not found

		FileReader fr=new FileReader("C:\\Users\\ravin\\Desktop\\Qspider\\input.txt");

		reader=new BufferedReader(fr);
		Line=reader.readLine();


		while(Line!=null)
			{
			
			//System.out.println(Line);

			countword=countwordinfile.ReadInputFile(Line,word);		//Function to count the total count of word in the file

				if(countword!=0){

					System.out.println("File contains word is "+Line);

					System.out.println("Totalcount of word java in file is "+countword);
					totalcount=totalcount+countword;	

						}

				//count of word java in all files
			Line=reader.readLine(); 			//reading next file path
			}

		reader.close()	;	//closing the buffer reader pointer to avoid nullpointer exception in future
		System.out.println("total times the word java is appreared in all files is " +totalcount);

		}

		catch(IOException e)
		{
		e.printStackTrace();
		}

		}

		
}
