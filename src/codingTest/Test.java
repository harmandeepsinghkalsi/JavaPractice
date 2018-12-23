package codingTest;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test{
	 
	
	public static void main (String args[]){
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FastReader fr= new FastReader();
//		int N = fr.nextInt();
//		int P[] = new int[N];
//		for (int i = 0; i < N; i++) {
//			P[i]= fr.nextInt();
//		}
//		
//		int Q= fr.nextInt();
//		int L[] = new int[Q];
//		int R[] = new int[Q];
//		for (int i = 0; i < Q; i++) {
//			 L[i] = fr.nextInt();
//			 R[i] = fr.nextInt();
//		}
//		
//		
//		int count;
//		for (int i = 0; i < Q; i++) {
//			count=0;
//			
//			for (int j = 0; j<P.length; j++) {
//				if(P[j]>=L[i] && P[j]<=R[i]){
//					count++;
//				}
//				
//				
//			}
//			System.out.println(count);
//		}
		int N=0,M=0,K=0,size=0,pos=0,range=0,risk=0;
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer,Boolean> hm  = new HashMap<>();
		int T= fr.nextInt();
		while(T-->0){
			 N = fr.nextInt();
			 M= fr.nextInt();
			 size= fr.nextInt();
			 K= fr.nextInt();
			 
				
			while(N-->0){
				 pos= fr.nextInt();
				 range=fr.nextInt();
				 if(range<0){
					 risk=pos-range;
				 }else
					 risk=pos+range;
				 for (int i = 1; i <= M; i++) {
						hm.put(i,true);
					}
				 
				 //where missile will fall
				hm.put(pos, false); 
				
				//where the missile will burst 
				hm.put(risk,false);
				
				//starting boundary of parking
				hm.put(M,false);
				
				// ending boundary of parking
				hm.put(1, false);
				
				//if sie of car is big than parking lot
				if(size>=M || size==M-1 )
				al.add(0);	
				
				
				 
			}
			

			
			
			
		}
		
		
		
		//function for landing a car safely
		
		
		//setting all indexes as false
		
		
	}
	
	// fast reader class
	 static class FastReader {
			BufferedReader br;
			StringTokenizer st;

			public FastReader() {
				br = new BufferedReader(new InputStreamReader(System.in));
			}

			String next() {
				while (st == null || !st.hasMoreElements()) {
					try {
						st = new StringTokenizer(br.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return st.nextToken();
			}

			int nextInt() {
				return Integer.parseInt(next());
			}

			long nextLong() {
				return Long.parseLong(next());
			}

			double nextDouble() {
				return Double.parseDouble(next());
			}

			String nextLine() {
				String str = "";
				try {
					str = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return str;
			}
		}


 }
	
	
		