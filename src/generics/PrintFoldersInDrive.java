package generics;

import java.io.File;
import java.io.FileReader;

public class PrintFoldersInDrive {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\");
		File[] fArr = f.listFiles();
		
		for (int i = 0; i < fArr.length; i++) {
			if(fArr[i].isHidden())
			System.out.println(fArr[i]);
		}
		
	}

}
