package Animals;
import java.time.*;

public class Reservor {

    private String Name;
    private LocalDateTime ReservedAt;

    public String getName() {
        return Name;
    }

    public LocalDateTime getReservedAt() { return ReservedAt; }

    public Reservor(String name, LocalDateTime reservedAt) {
        this.Name = name;
        this.ReservedAt = reservedAt;
    }

}
