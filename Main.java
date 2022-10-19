import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        File f = new File("inventario.txt");
        
        Elemento e = new Elemento("Pasta", 1);

        try {           
            if (f.createNewFile()) {
                System.out.println("File creato");
            } else {
                System.out.println("File esistente");
            }

            FileWriter fw = new FileWriter("inventario.txt");
            fw.write(e.toString());
            fw.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.print(e.toString());
    }
}
