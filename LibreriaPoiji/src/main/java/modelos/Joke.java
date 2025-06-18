package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {
    @JsonProperty("type")
    private String type;
    @JsonProperty("setup")
    private String setup;
    @JsonProperty("puchline")
    private String puchline;
    @JsonProperty("id")
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                type: %s
                setup: %s
                puchline: %s
                id: %d
                }
                """;
        return String.format(multilinea, type, setup, puchline, id);
    }
}
