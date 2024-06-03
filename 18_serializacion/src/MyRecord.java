import java.io.Serializable;

record MyRecord(int b) implements Serializable {
	//public transient int k;// no admite variables de instancia
	 static int f=10;

}
