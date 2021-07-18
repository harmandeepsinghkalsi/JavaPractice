import java.util.HashSet;
import java.util.Set;


class Node{
	
	String data;
	String data1;
	
	Node(String first, String last) {
		this.data = first;
		this.data1 = last;
		
	}
	
	@Override
	public int hashCode() {
//		 System.out.println("In hashcode");
		int hashcode = 0;
		hashcode += data.hashCode()+data1.hashCode();
		return hashcode;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o == this) { 
            return true; 
        }
		
		if (!(o instanceof Node)) { 
            return false; 
        }
		
		Node person = (Node) o;
	    return data.equals(person.data)
	            && data1.equals(person.data1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+ data + "-"+ data1 + "}";
	}
}


public class ObjectInSet {
	
	
	

		
		public static void main(String []args)
		{
			
			Set<Node> set = new HashSet<>();
			set.add(new Node("john","tom"));
			set.add(new Node("john","mary"));
			set.add(new Node("john","tom"));
			set.add(new Node("mary","anna"));
			set.add(new Node("mary","anna"));
				
			System.out.println(set);
			
		}
		
			

}
