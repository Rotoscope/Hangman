/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.HashMap;

/**
 *
 * @author Azusa
 */
public class HangmanWord {
    public String word;
    HashMap<Character, Boolean> letters;
    
    public HangmanWord() {
	word = "WORD";
	word = word.toUpperCase();
	letters = new HashMap();
	for(int i = 0; i < word.length(); i++) {
	    if(!letters.containsKey(word.charAt(i)))
		letters.put(word.charAt(i), Boolean.FALSE);
	}
    }
    
    public String getWord() {
	return word;
    }
    
    public boolean hasLetter(String letter) {
	if(word.contains(letter)) {
	    letters.put(letter.charAt(0), Boolean.TRUE);
	}
	
	return word.contains(letter);
    }
    
    public boolean isComplete() {
	return letters.values().stream().noneMatch((b) -> (b.equals(Boolean.FALSE)));
    }
}
