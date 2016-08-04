/* 2.8.2016 Hr.Jakob
 *
 */
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Haut
{
	 // Weil wir diese Zahl �berwachen wollen, legen wir nicht mittels
	 //  "int br�unungsgrad" eine einfache Variable an, sondern eine Property.

   IntegerProperty br�unungsgradProperty = new SimpleIntegerProperty(1);

  /** Die �berwachung der Br�ungsgrad Property wird aktiviert.
   * Ein ChangeListener gibt jeweils den alten und neuen Wert der Property aus.
   * Hier m�ssen Sie f�r den Wecker etwas �ndern. (Zweite Methode)
   */
   public void beobachtenBr�unungsgrad()
	   {
        // Hier f�gen wir hinzu, wie das Programm auf Wert�nderungen reagieren soll:
	    br�unungsgradProperty.addListener(new ChangeListener<Number>()
	       {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
              {
               System.out.println("Ge�ndert von " + oldValue + " auf " + newValue);
              }
           });
	   }


/**	Der Wert der Br�unungsgradproperty wird um eins erh�ht.
 *
 */
   	public void erh�henBr�unungsgrad()
   	  {
   		br�unungsgradProperty.setValue(br�unungsgradProperty.getValue()+1);
      }

}
