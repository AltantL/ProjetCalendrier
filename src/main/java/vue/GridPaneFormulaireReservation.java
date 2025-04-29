package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import modele.CalendrierDuMois;
import modele.Date;

import static modele.ConstantesCalendrier.*;

public class GridPaneFormulaireReservation extends GridPane {
    public GridPaneFormulaireReservation() {

        Date today = new Date();
        CalendrierDuMois moisActuel = new CalendrierDuMois(today.getMois(), today.getAnnee());
        //System.out.println (moisActuel);
        Label labelTitle = new Label(MOIS[moisActuel.getMois()-1] + " " +
                moisActuel.getAnnee());

        this.add(labelTitle, 2, 0,2,1);


        Label labelCours = new Label("Cours");
        Label labelNiveau = new Label("Niveau");
        Label labelHoraire = new Label("Horaire");

        TextArea textArea = new TextArea();

        ToggleButton boutonDate = new ToggleButton();
    }
}
