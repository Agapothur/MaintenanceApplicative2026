
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalandarTests {

    @Test
    void ajouterEvent_ajouteUnEvenementALaListe() {
        CalendarManager cm = new CalendarManager();

        cm.ajouterEvent(
                "RDV_PERSONNEL",
                "Dentiste",
                "John",
                LocalDateTime.of(2024, 3, 10, 14, 0),
                30,
                null,
                null,
                0
        );

        assertEquals(1, cm.events.size());
        assertEquals("Dentiste", cm.events.get(0).title);
    }

    @Test
    void eventsDansPeriode_retourneSeulementCeuxDansLaPeriode() {
        CalendarManager cm = new CalendarManager();

        cm.ajouterEvent("RDV_PERSONNEL", "Dentiste", "John",
                LocalDateTime.of(2024, 3, 10, 14, 0),
                30, null, null, 0);

        cm.ajouterEvent("RDV_PERSONNEL", "Sport", "John",
                LocalDateTime.of(2024, 3, 20, 18, 0),
                60, null, null, 0);

        var result = cm.eventsDansPeriode(
                LocalDateTime.of(2024, 3, 1, 0, 0),
                LocalDateTime.of(2024, 3, 15, 23, 59)
        );

        assertEquals(1, result.size());
        assertEquals("Dentiste", result.get(0).title);
    }

    @Test
    void description_rdvPersonnel() {
        Event e = new Event(
                "RDV_PERSONNEL",
                "Dentiste",
                "John",
                LocalDateTime.of(2024, 3, 10, 14, 0),
                30,
                null,
                null,
                0
        );

        assertEquals("RDV : Dentiste à 2024-03-10T14:00", e.description());
    }

    @Test
    void conflit_retourneVraiSiChevauchement() {
        CalendarManager cm = new CalendarManager();

        Event e1 = new Event("RDV_PERSONNEL", "Dentiste", "John",
                LocalDateTime.of(2024, 3, 10, 14, 0),
                60, null, null, 0);

        Event e2 = new Event("RDV_PERSONNEL", "Sport", "John",
                LocalDateTime.of(2024, 3, 10, 14, 30),
                30, null, null, 0);

        assertTrue(cm.conflit(e1, e2));
    }
}
