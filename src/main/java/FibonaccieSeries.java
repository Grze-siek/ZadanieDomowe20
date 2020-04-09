public class FibonaccieSeries {
    public static void main(String[] args) {

        FibonaccieSeries fibo = new FibonaccieSeries();
        System.out.println(fibo.sumOfEvenElementsOFFibbonacciesString(10));
    }
    public long sumOfEvenElementsOFFibbonacciesString(long border){
        long sumOfTheElementsOfTheString = 2;
        if(border <= 2)
            return 0;
        for (int firstValue = 1, secondValue = 2, nextValue = 0; nextValue < border; firstValue = secondValue, secondValue = nextValue) {
            nextValue = firstValue + secondValue;
            if (nextValue % 2 == 0)
                sumOfTheElementsOfTheString += nextValue;
        }
        return sumOfTheElementsOfTheString;
    }
}
