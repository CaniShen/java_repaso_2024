import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int [] x={2,6,3,8};
		int [] y={2,9};
		int [] z={2,6,3};
		int [] w={2,6,3,8,5,9,3};
		System.out.println(Arrays.compare(x,w));
		System.out.println(Arrays.compare(z,w));
		System.out.println(Arrays.compare(y,z));//1
		System.out.println(Arrays.compare(x,w));//-3
		System.out.println(Arrays.compare(z,w));//-4 
	}

}
