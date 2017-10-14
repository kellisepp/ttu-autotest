

import org.junit.Test;
import org.openweathermap.api.WeatherForecast;

public class WeatherForecastTest {

	WeatherForecast weatherForecast = new WeatherForecast();
	String mockCityName = "Tallinn";
	String mockCountryCode = "EE";
	Integer mockForecastLengthInDays = 3;

	@Test
	public void testConnectionToWeatherAPI() {
	}

	@Test
	public void doesGetCurrentTemperatureReturnTemperature() {
		weatherForecast.getCurrentTemperature(mockCityName, mockCountryCode);
	}

	@Test
	public void doesGetHighestTemperatureForLastThreeDaysReturnForecastOfThreeDays() {
		weatherForecast.getHighestTemperatureForLastThreeDays(mockCityName, mockCountryCode, mockForecastLengthInDays);
	}

	@Test
	public void getReturnLowestTemperatureForLastThreeDaysDoesReturnForecastOfThreeDays() {
		weatherForecast.getLowestTemperatureForLastThreeDays(mockCityName, mockCountryCode, mockForecastLengthInDays);
	}

	@Test
	public void doesGetCityCoordinatesReturnCoordinates() {
		weatherForecast.getCityCoordinates(mockCityName, mockCountryCode);
	}
}
