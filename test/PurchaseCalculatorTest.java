import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PurchaseCalculatorTest {

    PurchaseCalculator calculator = new PurchaseCalculator();

    @Test
    @DisplayName("PruebaSubtotal")
    void prubaSubtotal (){

        //valor esperado, llamarFuncion, tolerancia (0.001))
        assertEquals(300.0,calculator.calculateSubtotal(100,3), 0.001);
        assertEquals(2500.0,calculator.calculateSubtotal(500,5), 0.001);
        assertEquals(600.0,calculator.calculateSubtotal(600,1), 0.001);
        assertEquals(0.0,calculator.calculateSubtotal(0,3), 0.001);
    }//pruebaSubTotal

    @Test
    @DisplayName("PruebaCompraValida")
    void pruebaCompraValida (){

        //valor esperado, llamarFuncion)
        assertTrue(calculator.isValidPurchase(100,3));
        assertFalse(calculator.isValidPurchase(0,5));
        assertFalse(calculator.isValidPurchase(100,0));
        assertFalse(calculator.isValidPurchase(-50,2));
        assertFalse(calculator.isValidPurchase(90,-3));
    }//pruebaCompraValida

    @Test
    @DisplayName("PruebaDescuento")
    void pruebaDescuento (){

        //valor esperado, llamarFuncion, tolerancia (0.001))
        assertEquals(0, calculator.calculateDiscount(500), 0.001);
        assertEquals(100, calculator.calculateDiscount(1000), 0.001);
        assertEquals(120, calculator.calculateDiscount(1200), 0.001);
        assertEquals(0, calculator.calculateDiscount(-1000), 0.001);
    }//pruebaDescuento

    @Test
    @DisplayName("PruebaPrecioFinal")
    void pruebaPrecioFinal (){

        //valor esperado, llamarFuncion, tolerancia (0.001))
        assertEquals(500, calculator.calculateFinalPrice(500), 0.001);
        assertEquals(900, calculator.calculateFinalPrice(1000), 0.001);
        assertEquals(1080, calculator.calculateFinalPrice(1200), 0.001);
    }//pruebaPrecioFinal

}//class PurchaseCalculatorTest
