/* 2.8.2016 Hr.Jakob
 *
 */
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Haut
{
	 // Weil wir diese Zahl überwachen wollen, legen wir nicht mittels
	 //  "int bräunungsgrad" eine einfache Variable an, sondern eine Property.

   IntegerProperty bräunungsgradProperty = new SimpleIntegerProperty(1);

  /** Die Überwachung der Bräungsgrad Property wird aktiviert.
   * Ein ChangeListener gibt jeweils den alten und neuen Wert der Property aus.
   * Hier müssen Sie für den Wecker etwas ändern. (Zweite Methode)
   */
   public void beobachtenBräunungsgrad()
	   {
        // Hier fügen wir hinzu, wie das Programm auf Wertänderungen reagieren soll:
	    bräunungsgradProperty.addListener(new ChangeListener<Number>()
	       {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
              {
               System.out.println("Geändert von " + oldValue + " auf " + newValue);
              }
           });
	   }


/**	Der Wert der Bräunungsgradproperty wird um eins erhöht.
 *
 */
   	public void erhöhenBräunungsgrad()
   	  {
   		bräunungsgradProperty.setValue(bräunungsgradProperty.getValue()+1);
      }

}
