package PracticeProj;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		CreateFile cf = new CreateFile();


		
		while(true) {
			System.out.println("\n1 to write\n 2 to read\n 3 to append");
			int i = sc.nextInt();
			if(i==1)
			{
				cf.write();
			}
			else if(i==2)
			{
				cf.read();
				}
			else if(i==3)
			{
				cf.append();
				}
			else {
				System.out.println("Exited");
				break;}
		
		}

	}

}

class CreateFile {

	Scanner sc = new Scanner(System.in);

	void write() {

		System.out.println("enter path");
		String wname = sc.nextLine();
		File file = new File(wname);

		try {

			System.out.println(file.createNewFile());
			FileWriter write = new FileWriter(file);
			System.out.println("Enter the matter");
			String k = sc.nextLine();
			write.write(k);
			write.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void read() {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("enter path");
			String fname = sc.nextLine();
			FileInputStream file = new FileInputStream(fname);

			BufferedInputStream input = new BufferedInputStream(file);

			int i = input.read();

			while (i != -1) {
				System.out.print((char) i);

				i = input.read();
			}
			input.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}

	void append() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter path");
		String path = sc.nextLine();
		System.out.println("Enter string");
		String text = sc.nextLine();

		try {
			FileWriter fw = new FileWriter(path, true);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
		}
	}

}
