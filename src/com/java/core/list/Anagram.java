package com.java.core.list;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Anagram {
	private ArrayList<String> wordList;

	    public Anagram() {
	    	try {
	    		wordList = (ArrayList<String>) Files.readAllLines(Paths.get("src\\com\\java\\core\\wordList\\words.txt"));
			} 
	    	catch (IOException e) {
				e.printStackTrace();
			}
	    }

	    public ArrayList<String> getAnagrams(String word) {
	    	return wordList;
	    }
}