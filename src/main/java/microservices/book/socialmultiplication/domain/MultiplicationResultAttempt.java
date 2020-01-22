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

    public MultiplicationResultAttempt(User user, Multiplication multiplication, int resultAttempt, boolean isCorrect){
        this.user = null;
        this.multiplication = null;
        this.resultAttempt = -1;
    }
}
