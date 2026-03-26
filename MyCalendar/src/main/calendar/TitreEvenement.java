public final class TitreEvenement {
    private final String value;

    public TitreEvenement(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Le titre ne peut pas être vide.");
        }
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}