
public class Generics {
	
	//Compare the values of any kind
	public static <T extends Comparable<T>>	T findMax(T a, T b)
	{
		int n=a.compareTo(b);
		if(n>0)
			return a;
		else 
			return b;
		
		
	}
	
	//print the different kind of arrays
	public static <T> void printArray(T[] t){
		   for(T x:t) {
		        System.out.print(x);
		    }
		   System.out.println();
	}
	
	public static void main(String args[])
	{
		System.out.println(findMax(1,6));
		System.out.println(findMax('a','d'));
		System.out.println(findMax("deep","harman"));
		
		Integer intArr[]={1,3,4,2,5,9};
		printArray(intArr);
		String stringArray[]={"Hello","Harmandeep","here"};
		printArray(stringArray);
	}
}





//abstract class Shape{  
//abstract void draw();  
//}  
//class Rectangle extends Shape{  
//void draw(){System.out.println("drawing rectangle");}  
//}  
//class Circle extends Shape{  
//void draw(){System.out.println("drawing circle");}  
//}  
//  
//  
//class GenericTest{  
////creating a method that accepts only child class of Shape  
//public static void drawShapes(List<? extends Shape> lists){  
//for(Shape s:lists){  
//s.draw();//calling method of Shape class by child class instance  
//}  
//}  
//public static void main(String args[]){  
//List<Rectangle> list1=new ArrayList<Rectangle>();  
//list1.add(new Rectangle());  
//  
//List<Circle> list2=new ArrayList<Circle>();  
//list2.add(new Circle());  
//list2.add(new Circle());  
//  
//drawShapes(list1);  
//drawShapes(list2);  
//}}  
