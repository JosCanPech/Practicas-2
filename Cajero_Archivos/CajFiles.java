import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CajFiles {
    
    public void crear(String nombre) {
    try {
      ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombre));
      outputStream.close();
      System.out.println("Archivo creado correctamente: " + nombre);
    } catch (IOException e) {
      System.err.println("Error al crear el archivo: " + e.getMessage());
    }
  }

  public static void escribir(String nombre, ArrayList<Billetes> billetes) {
    try {
      ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombre));

      outputStream.writeObject(billetes);
      outputStream.close();
      System.out.println("Movimiento guardado en el archivo: " + nombre);
    } catch (IOException e) {
      System.err.println("Error al escribir en el archivo: " + e.getMessage());
    }
  }

  public static void leer(String nombre) {
    try {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombre));

      try {
        while (true) {
          ArrayList<Billetes> billetes = (ArrayList<Billetes>) inputStream.readObject();
          for (Billetes m: billetes) {
            System.out.println('1');
            System.out.println(m);
          }
        }
      } catch (EOFException e) {
       
      }

      inputStream.close();
    } catch (IOException | ClassNotFoundException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }
  }
}
