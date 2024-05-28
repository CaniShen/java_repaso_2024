import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

class A{
	public List<Serializable> get(Set<? extends Number> lst){return null;}
}
class B extends A{
	public Vector<Serializable> get(Set<? super Number> lst){return null;} 	
}
