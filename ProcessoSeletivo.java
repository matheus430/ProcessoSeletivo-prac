package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		String [] candidatos = {"CAIO", "CARLA", "GABRIEL", "GUSTAVO", "MATHEUS"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
			
		
		}
	static void entrandoEmContato (String candidato) {
		int tentativasRealizadas = 1; 
		boolean continuarTentando = true;
		boolean atendeu = false; 
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso");
			
		} while(continuarTentando && tentativasRealizadas <3);
		
		if(atendeu)
			System.out.println("conseguimos contato com o " + candidato + " NA " + tentativasRealizadas + "º tentativa");
		else 
			System.out.println("nao conseguimos contato com o " + candidato + " numero maximo de tentativas " + tentativasRealizadas);
	}
	 
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"CAIO", "CARLA", "GABRIEL", "GUSTAVO", "MATHEUS"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de nº " + (i + 1) + " é " + candidatos[i]);
			
		}
		
		System.out.println("forma de iteração via forEach: ");
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}

	}
	

	
	
	static void selecaoCandidatos() {
		String [] candidatos = {"CAIO", "CARLA", "GABRIEL", "GUSTAVO", "MATHEUS", "MARIA", "VITOR", "VITORIA", "PAULA", "PAULO" };
		
		
		
		int candaditosSelecionados = 0;
		int candidatoAtual = 0; 
		double salarioBase = 2000.0;
		while(candaditosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
				if(salarioBase >= salarioPretendido) {
					System.out.println("O candidato " + candidato + " foi selecionado pra vaga");
					candaditosSelecionados++;
				}
				
				candidatoAtual++;	
			}
		}
	
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
		
	}
	
	static void analisarCadidato(double salarioPretendido) {
		
		double salarioBase = 2000.0; 
		if(salarioBase > salarioPretendido) 
			System.out.println("Ligar para o candidato");
		else if(salarioBase == salarioPretendido) 
			System.out.println("Ligar para o candidato com contra proposta");
		 else
			System.out.println("Aguardando resultado dos demais candidatos");
	}
}