package Modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;

public class CrearCarpetaCliente {

    public CrearCarpetaCliente() {
    }

    public void crearCarpeta(String setNameCarpetaCliente, String setNameCarpetaObra) {

        rutaDirectorioCreado = new File(setNameCarpetaCliente, setNameCarpetaObra);
        
        System.out.println(rutaDirectorioCreado);

        if (!rutaDirectorioCreado.exists()) {
            rutaDirectorioCreado.mkdirs();

        }
        
    }
    
  

    public void moveFile(String urlOrigen, String urlDestino) {

        origenPath = FileSystems.getDefault().getPath(urlOrigen);

        destinoPath = FileSystems.getDefault().getPath(urlDestino);

        try {
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
          JOptionPane.showMessageDialog(null, "Carpeta movida");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Carpeta no movida");
        }

    }

    //RENOMBRAR UN ARCHIVO
    public void renameFile(String fichero1, String fichero2) {

        File remito1 = new File(fichero1);

        File remito2 = new File(fichero2);

        boolean success = remito1.renameTo(remito2);

        if (!success) {
            System.out.println("No se ha cambiado el nombre");
        } else {
            System.out.println("Se ha modificado el nombre");
        }

    }

   
    private Path destinoPath;
    private Path origenPath;
    private File rutaDirectorioCreado;

}
