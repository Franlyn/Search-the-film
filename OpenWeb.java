import java.lang.Object;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;

public class OpenWeb
{
   public void openWebpage(String url)
   {
   
      if(Desktop.isDesktopSupported()){
         Desktop desktop = Desktop.getDesktop();
         try {
            desktop.browse(new URI(url));
         } 
         catch (IOException | URISyntaxException e) {
            e.printStackTrace();
         }
      }
      else{
         Runtime runtime = Runtime.getRuntime();
         try {
            runtime.exec("xdg-open " + url);
         } 
         catch (IOException e) {
            e.printStackTrace();
         }
      }   }
}