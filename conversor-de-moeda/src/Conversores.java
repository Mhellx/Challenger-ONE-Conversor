
import javax.swing.*;

public class Conversores {

	private static Conversor conversor = new Conversor();
	private static Convencoes array = new Convencoes();

	public static void main(String[] args) {
		Menu();
	}

	public static void Menu() {
		OpcoesDeConversor conversores = new OpcoesDeConversor();
		String[] conversorOpcoes = conversores.getConversorOpcoes();

		String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.DEFAULT_OPTION, null, conversorOpcoes, conversorOpcoes[0]);

		if (escolha == "Conversor de moeda") {
			String[] convensoes = array.getMoedas();
			String texto = "Escolha a moeda para qual você deseja girar seu dinheiro";
			String titulo = "Converter moedas";
			EscolherConversor(convensoes, texto, titulo);
		}

		if (escolha == "Conversor de temperatura") {
			String[] convensoes = array.getTemperaturas();
			String texto = "Escolha a temperatura para qual você deseja converter";
			String titulo = "Converter temperaturas";
			EscolherConversor(convensoes, texto, titulo);
		}
	}

	public static void EscolherConversor(String[] convensoes, String texto, String titulo) {
		String respostaConvensao = (String) JOptionPane.showInputDialog(null, texto, titulo, JOptionPane.DEFAULT_OPTION,
				null, convensoes, convensoes[0]);
		InserirValor(respostaConvensao);
	}

	public static void InserirValor(String respostaConvensao) {
		try {
			double valor = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Insira um valor",
					respostaConvensao, JOptionPane.DEFAULT_OPTION));
			JOptionPane.showMessageDialog(null, conversor.converter(respostaConvensao, valor), respostaConvensao,
					JOptionPane.DEFAULT_OPTION);
			Continuar();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Valor inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
			InserirValor(respostaConvensao);
		}
		catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(null, "Programa finalizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void Continuar() {
		int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if (continuar == 0) {
			Menu();
		} else if (continuar == 1) {
			JOptionPane.showMessageDialog(null, "Programa finalizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Programa concluído", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
