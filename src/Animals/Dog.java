package Animals;
import java.time.*;

public class Dog {
    public LocalDateTime LastWalk;

    public LocalDateTime getLastWalk() {
        return LastWalk;
    }

    public void setLastWalk(LocalDateTime lastWalk) {
        LastWalk = lastWalk;
    }

    public boolean NeedsWalk() {
        return  (LocalDateTime.now().getDayOfYear() - getLastWalk().getDayOfYear()) >= 1;
    }
}
