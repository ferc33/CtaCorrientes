
package Vista;

import Controlador.ControladorEvento;
import Modelo.BaseDatos;


public class main {


    public static void main(String[] args) {
        
        Principal vista = new Principal();
        BaseDatos bd = new BaseDatos();
        FrameVerRemitos frameVerRemitos = new FrameVerRemitos();
        
       vista.setVisible(true);
       
       ControladorEvento controlador = new ControladorEvento(vista,bd,frameVerRemitos);
       
    }
    
}
