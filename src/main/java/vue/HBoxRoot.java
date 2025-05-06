package vue;

import javafx.scene.control.Control;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import modele.PlanningCollection;

public class HBoxRoot extends HBox {

    private static PlanningCollection planning;
    private static Control controleur;
    private static GridPane calendrierPane;
    private static GridPaneFormulaireReservation reservationPane;

    public HBoxRoot() {

        super(30);

        PlanningCollection planning = new PlanningCollection();
        Control contleur = new Control() {
            @Override
            public boolean isResizable() {
                return super.isResizable();
            }
        };
        GridPane calendrierPane = new GridPane();
        GridPane reservationPane = new GridPane();


        VBoxCalendrier vBoxCalendrier = new VBoxCalendrier();
        GridPaneFormulaireReservation gridPaneFormulaireReservation = new GridPaneFormulaireReservation();
        this.getChildren().addAll(vBoxCalendrier, gridPaneFormulaireReservation);
    }

    public static PlanningCollection getPlanning(){
        return planning;
    }

    public static Control getControleur(){
        return controleur;
    }

    public static GridPane getCalendrierPane(){
        return calendrierPane;
    }

    public static GridPaneFormulaireReservation getReservationPane(){
        return reservationPane;
    }

}
