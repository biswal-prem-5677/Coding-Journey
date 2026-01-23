import java.io.*;

class FileWriteDemo {
    	public static void main(String[] args) throws IOException {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	FileWriter fw = new FileWriter("Output.txt", true);

        	System.out.println("Type text (type 'exit' to stop):");

        	while (true) {
            		String line = br.readLine();

            		if (line.equalsIgnoreCase("exit")) break;  
            		fw.write(line + "\n"); 
        	}

        	fw.close();
        	br.close();
    	}
}
