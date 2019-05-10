package main;

import word.Word;

public class Main {
	public static void main(String[] args) {
		Word runner = new Word();
		runner.set();
		System.out.println(runner.retrieve());
	}
}
