import java.time.Duration;

public final class DureeEvenement {
    private final Duration value;

    public DureeEvenement(Duration value) {
        if (value == null || value.isNegative() || value.isZero()) {
            throw new IllegalArgumentException("La durée doit être positive.");
        }
        this.value = value;
    }

    public static DureeEvenement minutes(long minutes) {
        return new DureeEvenement(Duration.ofMinutes(minutes));
    }

    public Duration value() {
        return value;
    }

    @Override
    public String toString() {
        return value.toMinutes() + " minutes";
    }
}