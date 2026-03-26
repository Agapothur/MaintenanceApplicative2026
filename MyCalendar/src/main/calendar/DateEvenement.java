import java.time.LocalDate;

public final class DateEvenement {
    private final LocalDate value;

    public DateEvenement(LocalDate value) {
        if (value == null) {
            throw new IllegalArgumentException("La date ne peut pas être null.");
        }
        this.value = value;
    }

    public LocalDate value() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}