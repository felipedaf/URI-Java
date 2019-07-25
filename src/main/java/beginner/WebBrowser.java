package beginner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WebBrowser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int times = Integer.parseInt(sc.nextLine());
			Library lib = new Library();
			boolean someP = false;
			
			for(int i = 0; i < times; i++) {
				Set<String> possibilities = lib.getPossibles(sc.nextLine());
				
				if(possibilities != null) {
					for(String str: possibilities) {
						
					}
				}
				
			}
			
			
		}
	}

}

class WordHist{
	private int wordCharAt;
	private Map<Character, WordHist> nextChars;
	private Set<String> words;
	
	public WordHist(int charAt) {
		this.wordCharAt = charAt;
		this.nextChars  = new HashMap<Character, WordHist>();
		this.words = new HashSet<String>();
	}
	
	public void add(String word) {
		if(word != null && word.length() - 1 >= this.wordCharAt) {
			word = word.toLowerCase();
			this.words.add(word.trim().toLowerCase());
			
			if(word.length() - 1 >= this.wordCharAt + 1) {
				char nextChar = word.charAt(wordCharAt + 1);
				
				if(!this.nextChars.containsKey(nextChar)) {
					this.nextChars.put(nextChar, new WordHist(this.wordCharAt + 1));
				}
				
				nextChars.get(word.charAt(wordCharAt + 1)).add(word);
			}
		}
	}
	
	public Set<String> getPossibles(String word) {
		if(word != null && word.length() > 0) {
			word = word.toLowerCase();
			if(word.length() - 1 > this.wordCharAt) {
				if(!this.nextChars.containsKey(word.charAt(this.wordCharAt + 1)))
					return null;
			
				return this.nextChars.get(word.charAt(this.wordCharAt + 1)).getPossibles(word);
			}
			return this.words;
		}
		return null;
	}
}

class Library{
	private Map<Character, WordHist> storage;
	
	public Library() {
		this.storage = new HashMap<Character, WordHist>();
	}
	
	public void add(String word) {
		if(word != null && word.length() > 0) {
			if(!this.storage.containsKey(word.charAt(0)))
				this.storage.put(word.charAt(0), new WordHist(0));
				
			storage.get(word.charAt(0)).add(word);
		}
	}
	
	public Set<String> getPossibles(String word){
		if(word != null && word.length() > 0) {
			word = word.toLowerCase();
			
			if(!this.storage.containsKey(word.charAt(0)))
				return null;
		
			return this.storage.get(word.charAt(0)).getPossibles(word);
		}
		return null;
	}
}
