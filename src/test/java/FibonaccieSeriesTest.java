
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonaccieSeriesTest {

    @Test
    @DisplayName("should return ten if border is ten")
    void shouldReturnTenIfBorderIsTen()
    {
        //Given
        FibonaccieSeries systemUnderTest = new FibonaccieSeries();
        //When
        int sum = (int) systemUnderTest.sumOfEvenElementsOFFibbonacciesString(10);
        //Then
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult, sum);
    }
    @Test
    @DisplayName("should return ten if border is twelve")
    void shouldReturnTenIfBorderIsTwelve()
    {
        //Given
        FibonaccieSeries systemUnderTest = new FibonaccieSeries();
        //When
        int sum = (int) systemUnderTest.sumOfEvenElementsOFFibbonacciesString(12);
        //Then
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult, sum);
    }
    @Test
    @DisplayName("should return zero if border is two")
    void shouldReturnZeroIfBorderIsTwo()
    {
        //Given
        FibonaccieSeries systemUnderTest = new FibonaccieSeries();
        //When
        int sum = (int) systemUnderTest.sumOfEvenElementsOFFibbonacciesString(2);
        //Then
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, sum);
    }

}
