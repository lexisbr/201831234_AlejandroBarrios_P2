package lenguajesproyecto2;
import java.io.IOException;

public class Procesos {
 
   public void cargarArchivo() {
       abrir();
   }
 
  private void abrir() {
  //ruta del archivo en el pc
  String file = new String("./home/alejandrob/NetBeansProjects/201831234_AlejandroBarrios_P2/LenguajesProyecto2/Gramatica.odt"); 
   
 try{ 
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+file);
     
   }catch(IOException e){
      e.printStackTrace();
   } 
  }
}