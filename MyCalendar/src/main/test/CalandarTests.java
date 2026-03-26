
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalandarTests {

    @Test
    void eventsDansPeriode_retourneSeulementCeuxDansLaPeriode() {
        CalendarManager cm = new CalendarManager();

        cm.ajouterEvent("RDV_PERSONNEL", "Dentiste", "Arthur",
                LocalDateTime.of(2024, 3, 10, 14, 0),
                30, null, null, 0);

        cm.ajouterEvent("RDV_PERSONNEL", "Sport", "Arthur",
                LocalDateTime.of(2024, 3, 20, 18, 0),
                60, null, null, 0);

        var result = cm.eventsDansPeriode(
                LocalDateTime.of(2024, 3, 1, 0, 0),
                LocalDateTime.of(2024, 3, 15, 23, 59)
        );

        assertEquals(1, result.size());
        assertEquals("Dentiste", result.get(0).title);
    }
}
