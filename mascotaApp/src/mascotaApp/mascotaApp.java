
package mascotaApp;

import java.util.ArrayList;
import mascotaservicio.servicioMascota;


public class mascotaApp {

    
    public static void main(String[] args) {
       servicioMascota servMasc = new servicioMascota();
       
       servMasc.crearMascota();
       servMasc.crearMascota();
       
       servMasc.mostrarMascota();

    }
    
}
