//The functions should have 1 parameter, and that is the temperature, whether in Celsius or Fahrenheit
//The parameter should be double, because the temperature is usually given more specifically than an integer
public class CtoFTester {
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(0.0));
    System.out.println(fahrenheitToCelsius(32.0));
    System.out.println(celsiusToFahrenheit(50.0));
    System.out.println(fahrenheitToCelsius(50.0));

  }
  public static double celsiusToFahrenheit(double temp) {
    return (temp * 9.0/5.0 + 32.0);
  }
  public static double fahrenheitToCelsius(double temp) {
    return ((temp - 32) * 5.0/9);
  }
}
