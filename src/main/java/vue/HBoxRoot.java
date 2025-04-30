package vue;

import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    public HBoxRoot() {
        super(30);
        VBoxCalendrier vBoxCalendrier = new VBoxCalendrier();
        GridPaneFormulaireReservation gridPaneFormulaireReservation = new GridPaneFormulaireReservation();
        this.getChildren().addAll(vBoxCalendrier, gridPaneFormulaireReservation);

    }
}
