package com.java.core.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.*; 
import com.java.core.angrams.AnagramCreator;
import com.java.core.list.Anagram;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter word to find anagrams for: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		Anagram anagramsFinder = new Anagram();
		ArrayList<String> anagrams = anagramsFinder.getAnagrams(word);   
        
        AnagramCreator creator = new AnagramCreator();
        ArrayList<String> possibleAnagrams = creator.generate(word);
        System.out.println(possibleAnagrams.toString());
        
        List<String> common = anagramsFinder
        	      .stream()
        	      .filter(possibleAnagrams::contains)
        	      .collect(Collectors.toList());
        
        
        System.out.println(common.toString());
        
	}
	
}