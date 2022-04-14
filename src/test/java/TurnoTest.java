import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TurnoTest {
    @BeforeEach
    public void beforeEach(){
        Turno.getInstance().setTurnoA(LocalTime.of(07,00));
        Turno.getInstance().setTurnoB(LocalTime.of(13,00));
        Turno.getInstance().setTurnoC(LocalTime.of(19,00));
    }

    @Test
    public void deveRetornar7horas(){
        Assertions.assertEquals(LocalTime.of(07,00),Turno.getInstance().getTurnoA());
    }

    @Test
    public void deveRetornar13horas(){
        Assertions.assertEquals(LocalTime.of(13,00),Turno.getInstance().getTurnoB());
    }

    @Test
    public void deveRetornar19horas(){
        Assertions.assertEquals(LocalTime.of(19,00),Turno.getInstance().getTurnoC());
    }
}