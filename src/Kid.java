import java.util.Objects;

public class Kid extends Pupil implements Speaking {
    String name;

    @Override
    public void speak() {
        System.out.println("Я капитан команды " + schoolNumber + " школы, мое имя: " + name);
    }

    public Kid(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kid kid = (Kid) o;
        return Objects.equals(name, kid.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
