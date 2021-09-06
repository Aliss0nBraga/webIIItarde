package hospital;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		end1.rua = "Tv. Não te interessa";
		end1.cidade = "Porto Alegre";
		end1.bairro = "Centro";
		end1.cep = "000";
		
		Medico med1 = new Medico();
		med1.endereco = end1;
		
//		System.out.println("O médico mora na rua "+med1.endereco.rua);
		
		// Pegando a data atual
		LocalDate hoje = LocalDate.now();
		// Definido a partir de uma data específica
		LocalDate especifica = LocalDate.of(1991, 9, 6);
		
		System.out.println("Dia atual: "+hoje.getDayOfMonth());
		System.out.println("Dia em que eu nasci: "+especifica.getDayOfMonth());
		
		int idade = hoje.getYear() - especifica.getYear();
		System.out.println("Você tem "+idade+" anos");
	}

}
