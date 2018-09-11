package Animals;
import java.time.*;

public class Reservor {

    public String Name;
    public LocalDateTime ReservedAt;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDateTime getReservedAt() {
        return ReservedAt;
    }

    public void setReservedAt(LocalDateTime reservedAt) {
        ReservedAt = reservedAt;
    }

    public Reservor(String name, LocalDateTime reservedAt) {
        Name = name;
        ReservedAt = reservedAt;
    }

}
