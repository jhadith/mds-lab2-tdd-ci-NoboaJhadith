
package espe.tdd;

import com.espe.tdd.stringcalculatorkata.StringCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    void cadenaVaciaDevuelveCero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }
    
    @Test
void unNumeroDevuelveElMismoNumero() {
    StringCalculator calc = new StringCalculator();
    assertEquals(1, calc.add("1"));
}

}