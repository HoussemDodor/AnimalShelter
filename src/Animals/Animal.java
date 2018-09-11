package Animals;
import java.time.*;

public abstract class Animal {
    // fields
    private String Name;
    private Gender Gender;
    private Reservor ReservedBy;

    // Properties
    public String getName() {
        return Name;
    }

    public Animals.Gender getGender() {
        return Gender;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }

    // Constructor
    public Animal(String name, Animals.Gender gender) {
        this.Name = name;
        this.Gender = gender;
    }

    // Methods
    public boolean Reserve(String reservedBy) {
        if (getReservedBy() == null) {
            this.ReservedBy = new Reservor(reservedBy, LocalDateTime.now());
            return true;
        }
        return  false;
    }

    public String ToString(){
        String reserved = "not reserved";
        if (this.ReservedBy != null)
        {
            reserved = String.format("reserved by %d", getReservedBy().getName());
        }
        return String.format("%d, %d, %d", this.getName(), this.getGender(), reserved);
    }
}
