
public class Conversor {

	public String converter(String opcao, double valor) {
		if (opcao == "Converter de Reais a Dólar") {
			return "R$" + valor + " Reais para Dólar são US$" + valor * 0.20;
		}
		if (opcao == "Converter de Reais a Euro") {
			return "R$" + valor + " Reais para Euro são " + valor * 0.18 + "€";
		}
		if (opcao == "Converter de Reais a Libras Esterlina") {
			return "R$" + valor + " Reais para Libras Esterlina são £" + valor * 0.16;
		}
		if (opcao == "Converter de Reais a Peso Argentino") {
			return "R$" + valor + " Reais para Peso argentino são $" + valor * 43.56 + "ARS";
		}
		if (opcao == "Converter de Reais a Peso Chileno") {
			return "R$" + valor + " Reais para Euro são $" + valor * 161.16 + "CLP";
		}
		if (opcao == "Converter de Dólar a Reais") {
			return "US$" + valor + " Dólar para Reais são R$" + valor * 4.93;
		}
		if (opcao == "Converter de Euro a Reais") {
			return valor + "€ Euro para Reais são R$" + valor * 5.45;
		}
		if (opcao == "Converter de Libras Esterlinas a Reais") {
			return "£" + valor + " Libras Esterlinas para Reais são R$" + valor * 6.18;
		}
		if (opcao == "Converter de Peso Argentino a Reais") {
			return "$" + valor + "ARS Peso Argentino para Reais são R$" + valor * 0.023;
		}
		if (opcao == "Converter de Peso Chileno a Reais") {
			return "$" + valor + "CLP Peso Chileno para Reais são R$" + valor * 0.0062;
		}
		if (opcao == "Converter de Celsius a Fahrenheit") {
			return valor + "°C para Fahrenheit são " + ((valor * 9/5) + 32) + "°F";
		}
		if (opcao == "Converter de Celsius a Kelvin") {
			return valor + "°C para Kelvin são " + (valor + 273.15) + "K";
		}
		if (opcao == "Converter de Fahrenheit a Celsius") {
			return valor + "°F para Celsius são " + ((valor -32) * 5/9) + "°C";
		}
		if (opcao == "Converter de Fahrenheit a Kelvin") {
			return valor + "°F para Kelvin são " + ((valor -32) * 5/9 + 273.15) + "K";
		}
		if (opcao == "Converter de Kelvin a Celsius") {
			return valor + "K para Celsius são " + (valor - 273.15) + "°C";
		}
		if (opcao == "Converter de Kelvin a Fahrenheit") {
			return valor + "K para Kelvin são " + ((valor - 273.15) * 9/5 + 32) + "°F";
		}
		return null;
	}
}
