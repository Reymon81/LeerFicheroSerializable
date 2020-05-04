import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerFicheroSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("departamentos.dat"));
		
		
		try {
			while(true) { 
				Atributos atributos = (Atributos) ois.readObject();
				System.out.printf("departamento: %d, nombre: %s, localidad: %s %n", atributos.getDepartamento(), atributos.getNombre(), atributos.getLocalidad());
			}
		}catch(EOFException eo) {
			
		}
			ois.close();
	}

}
