import java.io.*;

class WordCharCount {
    	public static void main(String[] args) throws IOException {
        	BufferedReader br = new BufferedReader(new FileReader("Output.txt"));

        	int charCount = 0, wordCount = 0;
        	String line;

        	while ((line = br.readLine()) != null) {
            		charCount += line.length();  
            		String[] words = line.trim().split("\\s+"); 
            		if (!line.trim().isEmpty()) {
                		wordCount += words.length;
            		}
        	}

        	br.close();

        	System.out.println("Number of characters: " + charCount);
        	System.out.println("Number of words: " + wordCount);
    	}
}
