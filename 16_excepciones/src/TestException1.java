
public class TestException1 {
	public void m() {
		try {
			int a=5;
		}
		catch(Exception ex) {// no puede poner SQLException, si ninguna de las intrucciones puede provocar los excepciones.
			ex.printStackTrace();
		}
	}

}
