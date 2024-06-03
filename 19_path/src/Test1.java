import java.nio.file.Path;

public class Test1 {

	public static void main(String[] args) {
		Path p1=Path.of("a.txt");
		Path p2=Path.of("/b/c/../.");
		
		System.out.println(p1.resolve(p2));

	}

}
