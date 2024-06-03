import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		MyRecord mr=new MyRecord(5);
		mr.f=20;
		try(var fo= new FileOutputStream("data.obj");
				var fi=new FileInputStream("data.obj");
				var out=new ObjectOutputStream(fo);
				var in=new ObjectInputStream(fi)){
			out.writeObject(mr);
			mr=(MyRecord)in.readObject();
			System.out.println(mr.b()+":"+mr.f);
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			
		}
		
	}

}
