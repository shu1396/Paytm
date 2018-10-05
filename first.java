import java.io.*;
import java.util.*;
import java.io.File;
class first{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String filename = sc.next();
		File file = new File(filename);
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]+" ");
		}
	}
}