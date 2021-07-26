package com.string;

/**
* Java Program to Reverse each Word of a String
*
* Input - Hello This is Java
* Output - avaJ si sihT olleH
*
*/

public class ReverseEachWord
{
	public static void main(String args[])
{
	String str = "Hello This is Java";

	//[Hello,This,is,Java]
	String[] words = str.split(" ");
	String revString = "";

	for(int i=0; i<words.length; i++)
{
	String word = words[i];
	String revWord = "";

	for(int j=word.length() -1; j>=0; j--)
{
	revWord = revWord + word.charAt(j);
}
	revString = revString + revWord +" ";
}
	System.out.println(revString);
}
}
