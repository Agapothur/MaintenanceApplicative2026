import java.util.UUID;

public final class EventId {
    private final UUID value;

    public EventId(UUID value) {
        if (value == null) {
            throw new IllegalArgumentException("L'ID ne peut pas être null.");
        }
        this.value = value;
    }

    public static EventId generate() {
        return new EventId(UUID.randomUUID());
    }

    public UUID value() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}