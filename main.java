package gr.lew.rps;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<String> results1 = new ArrayList();
		for(int i =0 ; i<10; i++) {
			results1.add("MOLYBI");
		}
		
		try
		{
		    String filename= "Res.txt";
		    StringBuilder builder = new StringBuilder();
		    
		    for(int i =0; i<results1.size();i++) {
		    	builder.append(results1.get(i) + " ");
		    }
		    System.out.println(builder.toString());
		    
		    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
		    fw.write(builder.toString());//appends the string to the file
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}

	}

}
