package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()) {
            String fileName = sc.next();
            int lineCount = 0;
            File file = new File(fileName);
            try (FileReader fr = new FileReader(file)) {
                int ch;
                while((ch=fr.read())!=-1){
                    if((char)ch=='\n')lineCount++;
                    //System.out.print((char)ch);
                }
                System.out.println();
                lineCount++;
                System.out.println("FileName :" +fileName+ "  :" + lineCount);
            }
            catch (FileNotFoundException e){
                System.out.println(e);
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }
}
