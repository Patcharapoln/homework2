import java.util.ArrayList;
import java.util.List;

public class Recursion {
	public static List unique(List list) {
		if (list.size() == 1) 
			return list;
		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}

	public static long fibonacci(int n) {
		return fiboHelper(1, 1, n);
	}
	
	/**
	 * A helper method for fibonacci.
	 * @param a is F(0) such as F(0) = 1.
	 * @param b is F(1) such as F(1) = 1.
	 * @param n is a term of function.
	 * @return fibonacci number of term n.
	 */
	public static int fiboHelper(int a, int b, int n) {
		  if(n == 0) 
			  return a;
		  else 
			  return fiboHelper(b, a+b, n-1);
	}
}
