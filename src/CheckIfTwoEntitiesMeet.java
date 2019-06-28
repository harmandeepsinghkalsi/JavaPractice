package practice;

public class CheckIfTwoEntitiesMeet {

	public static void main(String[] args) {

		int posA = 6, speedA = 6, posB = 4, speedB = 8;

		System.out.println(checkIfEntitiesMeet(posA, speedA, posB, speedB));
	}

	public static boolean checkIfEntitiesMeet(int pA, int sA, int pB, int sB) {

		if (pA > pB && sA > sB) {
			return false;
		}
		
		if(pB>pA && sB>sA) {
			return false;
		}
		
		//Making dis of A greater and adjusting the speed accordingly
		if(pA<pB) {
			int temp = pA;
			pA=pB;
			pB=temp;
			
			int temp1 = sA;
			sA=sB;
			sB=temp;
		}

		if ((pA - pB) % (sA - sB) == 0) {

			return true;
		} else {
			return false;
		}
	}
}
