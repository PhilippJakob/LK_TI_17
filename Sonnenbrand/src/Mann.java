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

/** Der Mann aktiviert erstmal �berhaupt die Beobachtung seiner Haut.
 * Die Weckerfunktion sollen Sie hier erg�nzen.
 */
  public void stellenSonnenwecker()
    {
	  haut.beobachtenBr�unungsgrad();
    }

/** Es wird gesonnt, bis es nicht mehr weiter geht.
 *  "Bis es nicht mehr weiter geht", bedeutet hier einen Wert von 256.
 *  Dieser Wert entspricht einem sehr sehr knusprig dunklen Rot.
 */
  public void sonnen()
    {
     // Hier erh�hen wir einfach den Br�unungsgrad. Kommentar nach Staged hinzugef�gt, sollte beim Commit fehlen.
     for (int i = 0; i<256 ;i++)
       {
    	 haut.erh�henBr�unungsgrad();

 	     //System.out.println(i);  // Wenn
         //Wartet beim Hochz�hlen jeweils kurz.
     	 try {
     		 Thread.sleep(100);
     		 } catch (Exception ex){}
     	 //System.out.println(ex);
       }
     }
}
