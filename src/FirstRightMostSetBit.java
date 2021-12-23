package practice;


// one way could be do % with 2 , and if results to be 1 , return the counter else divide by 2 and continue
public class FirstRightMostSetBit {

    public static void main(String[] args) {

        int num = 4 ; // 100

        int mask = 1;//001
        int counter = 1;

        if (num ==0)
            System.out.println(0);
        else {
            while (true) {

                if ((num & mask) == 1) {
                    break;
                }
                num = num >> 1;
                counter += 1;
            }

            System.out.println(counter);
        }
    }
}
