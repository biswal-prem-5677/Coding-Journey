import java.io.*;

class FileReadDemo {
    	public static void main(String[] args) throws FileNotFoundException , IOException
	{
        	String file = "C:\\Java_Code\\abc.txt"; 
        	BufferedReader br = new BufferedReader(new FileReader("C:\\Java_Code\\abc.txt"));
            	String line = br.readLine();
                
           	while (line != null) {
                	System.out.println(line);
			line=br.readLine();
            		}
        	
    	}
}
