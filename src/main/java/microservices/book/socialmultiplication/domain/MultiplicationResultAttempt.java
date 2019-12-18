package microservices.book.socialmultiplication.domain;

import lombok.*;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class MultiplicationResultAttempt {
    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    // Empty constructor for JSON (de)serialization

    MultiplicationResultAttempt(){
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }
}
