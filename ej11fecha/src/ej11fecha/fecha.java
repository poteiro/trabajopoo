
package ej11fecha;

import com.sun.istack.internal.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;



public class fecha {

    
    public static void main(String[] args) {
        try{
        SimpleDateFormat fechaf=new SimpleDateFormat("dd/mm/yyyy");
        Date fecha_inicio=fechaf.parse("09/08/2022");
        Date fecha_final=fechaf.parse("16/08/2022");
  
        long tiempo_trasncurrido=fecha_final.getTime() - fecha_inicio.getTime();
        
        TimeUnit unidad=TimeUnit.DAYS;
        
	long dias=unidad.convert(tiempo_trasncurrido, TimeUnit.MILLISECONDS);
       
            System.out.println("los dias faltantes son:" + dias + "dia(s)");
}catch (ParseException ex){   
// Logger.getLogger(fecha.class.getName()).log(Level.SEVERE,null,ex);
}  
    }   
}
