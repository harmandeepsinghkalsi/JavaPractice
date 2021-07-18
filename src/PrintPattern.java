
public class PrintPattern {
	public static void main(String[] args) {
		int gap[] = { 1, 3, 5, 8 };
		printDesign(10, gap);
	}

	static void printDesign(int breadth, int[] gap) {
		// declare variables size,i,j;
		// get input from the user for size
			for (int i = 0; i < gap.length; i++) {
				System.out.print("x");
				if (gap[i] >= breadth) {
					for (int j = 1; j < breadth; j++) {
						System.out.print("o");
					}
				} else {
					for (int j = 1; j < breadth; j++) {
						if(j%(gap[i]+1)==0) {
							System.out.print("x");
						} else {
							System.out.print("o");
						}
					}
				}
				System.out.print("\n");
			}
		}
	}

