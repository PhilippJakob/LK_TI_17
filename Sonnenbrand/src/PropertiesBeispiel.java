/* 2.8.2016 Hr.Jakob
 *
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PropertiesBeispiel extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

/** Beispiel: Ein Mann sonnt sich und beobachtet dabei seine sich verändernde Bräunung.
 *     
 * @see javafx.application.Application#start(javafx.stage.Stage)
 */
    @Override
  public void start(Stage primaryStage)
    {
     Mann lDummerMann = new Mann();
     lDummerMann.stellenSonnenwecker();
     lDummerMann.sonnen();
    }

}
