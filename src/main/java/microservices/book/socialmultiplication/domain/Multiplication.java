package microservices.book.socialmultiplication.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*
This is the multiplication class for the application
 */
@RequiredArgsConstructor
@Getter
@Setter
public final class Multiplication {

    // Both factors
    private final int factorA;
    private final int factorB;

    // Empty constructor for JSON (de)serialization
    Multiplication() {
        this(0, 0);
    }
}
