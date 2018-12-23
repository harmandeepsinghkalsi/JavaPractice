package codingTest;

import java.io.IOException;
import java.util.Scanner;

public class CheatingExam {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);

		StringBuffer decoded = new StringBuffer();

		int depth = sc.nextInt();
		String encoded = sc.next();
		int i = 0, j = 0, k = (encoded.length() / 2), l = (encoded.length() / 2) + 1, m = encoded.length() - 1, n = 0;

		char arr[][] = new char[depth][encoded.length()];
		while (i < depth - 1 && n < encoded.length()) {

			arr[i][j] = encoded.charAt(n);
			n++;
			j++;

			if (i == 0) {

				arr[i][k] = encoded.charAt(n);
				n++;
				k--;

			}

			else {

				arr[i][k] = encoded.charAt(n);
				n++;
				k--;

				arr[i][l] = encoded.charAt(n);
				n++;
				l++;

			}

			arr[i][m] = encoded.charAt(n);
			n++;
			m--;

			i++;

		}

		arr[i][j] = encoded.charAt(n);
		n++;
		arr[i][l] = encoded.charAt(n);


		
		int a=0;
		
		Boolean flag= false;
		while( a <encoded.length()) {
			
			int b=0;
				
				for ( b = 0; b < depth-1; b++) {
					
						if(a==encoded.length()){
							flag = true;
							break;
						}
						else{
						decoded.append(arr[b][a]);
						a++;
						}
				}
				
				if(flag== true)
					break;
				
				decoded.append(arr[b][a]);
				a=a+1;b=b-1;
				
				for ( int c = b; c > 0; c--) {
					
					if(a==encoded.length())
						break;
					else{
					decoded.append(arr[c][a]);
					a++;
					}
				}
				
				
		}



		System.out.println(decoded);

	}
}




//Boolean isDown = false;
//int a = 0, b = 0;
//while (b < encoded.length()) {
//
//	if (a == 0) {
//		isDown = true;
//	} else if (a == depth - 1) {
//		isDown = false;
//	}
//
//	if (arr[a][b] != 'X')
//		decoded.append(arr[a][b]);
//
//	if (isDown)
//		++a;
//	else
//		--a;
//
//	++b;
//}
