package se.lexicon.samuel;

import java.time.LocalDate;
import java.util.Objects;

public class Pet {
    private final int id;
    private String name;
    private LocalDate birthDate;
    private boolean isAlive;

    public Pet(int id, String name, LocalDate birthDate, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.isAlive = isAlive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id &&
                isAlive == pet.isAlive &&
                Objects.equals(name, pet.name) &&
                Objects.equals(birthDate, pet.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, isAlive);
    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", isAlive=" + isAlive +
                '}';
    }
}
