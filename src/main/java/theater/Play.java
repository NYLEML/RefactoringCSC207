package theater;

/**
 * Represents a play with a name and a type.
 *
 * <p>name and type must never be null
 *
 * @null name - never null
 * @null type - never null
 */
public class Play {

    String name;
    String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
