package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileIO {
	public static void main(String[] args) throws Exception {
		//Files in Java
		File f = new File("src\\javaIO\\xyz.txt");
		System.out.println("File name :"+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("Absolute path:" +f.getAbsolutePath());
        System.out.println("Parent:"+f.getParent());
        System.out.println("Exists :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable: "+f.canWrite());
            System.out.println("Is readable: "+f.canRead());
            System.out.println("Is executable: "+f.canExecute());
            System.out.println("Is a directory: "+f.isDirectory());
            System.out.println("File Size in bytes: "+f.length());
        }
		
        File f1 = new File("D:\\Oracle\\", "Notes");
		if(f1.exists()) {
			String s[] = f1.list();
			for(String i : s) {
				System.out.print(i + " is a : ");
				File f2 = new File("D:\\Oracle\\Notes\\", i);
				if(f2.isFile())
					System.out.println("File");
				if(f2.isDirectory())
					System.out.println("Directory");
			}
		}
		
		//File Reading in Java
		File f3 = new File("D:\\Oracle\\Notes\\VPAT.txt");
		BufferedReader br = new BufferedReader(new FileReader(f3));
		String st;
		while ((st = br.readLine()) != null)
		    System.out.print(st);
		System.out.println("bufferreader test ends");
		
		FileReader fr = new FileReader("D:\\Oracle\\Notes\\VPAT.txt");
		int i;
		while ((i = fr.read()) != -1)
		    System.out.print(i);
		System.out.println("filereader test ends");
		
		File f4 = new File("D:\\Oracle\\Notes\\VPAT.txt");
		Scanner sc = new Scanner(f4);
		while (sc.hasNextLine())
		    System.out.print(sc.nextLine());
		System.out.println("scanner test ends");
		
		Scanner sc1 = new Scanner(f4);
		sc1.useDelimiter("\\Z");
	    System.out.println(sc1.next());
		
		//Reading the whole file in a List
	    //Read a text file as String in Java:
		
	    //Moving a file from one directory to another using Java
	    
	    //Copying file using FileStreams in Java
	    
	    //Delete a file using Java
	    
	    //Java program to delete duplicate lines in text file
	    
	    //Java program to merge two files alternatively into third file

	    //Java program to List all files in a directory and nested sub-directories | Recursive approach
	    
	    //Java program to delete certain text from a file

	    //Check if a File is hidden in Java

	    //Redirecting System.out.println() output to a file in Java
	    
		
		
	}
}
