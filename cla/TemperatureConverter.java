package cla;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double tempC = 25.0;
        System.out.println("Celsius to Fahrenheit: " + converter.celsiusToFahrenheit(tempC));
        System.out.println("Celsius to Kelvin: " + converter.celsiusToKelvin(tempC));
        // You can test other methods similarly
    }
}
