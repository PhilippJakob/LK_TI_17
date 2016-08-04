/* 2.8.2016 Hr.Jakob
 *
 */
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Mann
{
  private Haut haut = new Haut();

/** Der Mann aktiviert erstmal überhaupt die Beobachtung seiner Haut.
 * Die Weckerfunktion sollen Sie hier ergänzen.
 */
  public void stellenSonnenwecker()
    {
	  haut.beobachtenBräunungsgrad();
    }

/** Es wird gesonnt, bis es nicht mehr weiter geht.
 *
 */
  public void sonnen()
    {
     // Hier erhöhen wir einfach den Bräunungsgrad.
     for (int i = 0; i<256 ;i++)
       {
    	 haut.erhöhenBräunungsgrad();

 	     //System.out.println(i);  // Wenn
         //Wartet beim Hochzählen jeweils kurz.
     	 try {
     		 Thread.sleep(100);
     		 } catch (Exception ex){}
     	 //System.out.println(ex);
       }
     }
}
