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

    public void setName(String name) {
        Name = name;
    }

    public Animals.Gender getGender() {
        return Gender;
    }

    public void setGender(Animals.Gender gender) {
        Gender = gender;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }

    public void setReservedBy(Reservor reservedBy) {
        ReservedBy = reservedBy;
    }

    // Constructor
    public Animal(String name, Animals.Gender gender) {
        setName(name);
        setGender(gender);
    }

    // Methods
    public boolean Reserve(String reservedBy) {
        if (getReservedBy() == null) {
            this.setReservedBy(new Reservor(reservedBy, LocalDateTime.now()));
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
        return String.format("%d, %d, $d", this.getName(), this.getGender(), reserved);
    }
}
