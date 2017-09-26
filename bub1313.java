import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bub1230 {

	public static void main(String[] args) {
		int[] arr = new int[26];
		File file = new File("TEXTBUB.txt");
		try {
			Scanner in = new Scanner(file);
			while(in.hasNext()){
				String s = in.next().toUpperCase();
				for(int ci = 0; ci < s.length(); ci++){
					if((int)(s.charAt(ci)) >= 'A' &&(int)(s.charAt(ci)) <= 'Z'){
							arr[(int)(s.charAt(ci)) - (int)'A']++;
					}
						
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 26; i++){
			System.out.println("Number of " + (char)(i + 65) + "'s: " + arr[i]);
		}

	}

}
