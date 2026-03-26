import java.time.LocalTime;

public final class HeureDebut {
    private final LocalTime value;

    public HeureDebut(LocalTime value) {
        if (value == null) {
            throw new IllegalArgumentException("L'heure ne peut pas être null.");
        }
        this.value = value;
    }

    public LocalTime value() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}