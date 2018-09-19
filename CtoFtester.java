public class CtoFtester {
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(18) + ", should be 64.4");
    System.out.println(celsiusToFahrenheit(7) + ", should be 44.6");
    System.out.println(celsiusToFahrenheit(0) + ", should be 32");
    System.out.println(fahrenheitToCelsius(87) + ", should be 30.5556");
    System.out.println(fahrenheitToCelsius(56) + ", should be 13.3333");
    System.out.println(fahrenheitToCelsius(72) + ", should be 22.2222");
  }
  public static double celsiusToFahrenheit(int c) {
    return (c * 1.8 + 32);
  }
  public static double fahrenheitToCelsius(int f) {
    return ((f - 32) / 1.8);
  }
}
