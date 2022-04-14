import java.time.LocalDate;
import java.time.LocalTime;

public class Turno  {
    private static Turno instance = new Turno();

    private Turno(){};

    public static Turno getInstance() {
        return instance;
    }

    private LocalTime turnoA;
    private LocalTime turnoB;
    private LocalTime turnoC;

    public LocalTime getTurnoA() {
        return turnoA;
    }

    public void setTurnoA(LocalTime turnoA) {
        this.turnoA = turnoA;
    }

    public LocalTime getTurnoB() {
        return turnoB;
    }

    public void setTurnoB(LocalTime turnoB) {
        this.turnoB = turnoB;
    }

    public LocalTime getTurnoC() {
        return turnoC;
    }

    public void setTurnoC(LocalTime turnoC) {
        this.turnoC = turnoC;
    }
    public static void main(String[] args) {
        Turno.getInstance().setTurnoA(LocalTime.of(07,00));
        System.out.println(Turno.getInstance().getTurnoA());
    }
}

