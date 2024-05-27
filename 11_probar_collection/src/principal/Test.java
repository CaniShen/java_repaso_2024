package principal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List<Integer> l1=List.of(1,null,3,1);
		Set<Integer> st=new HashSet(l1);
		System.out.println(st.size()); 

	}

}
