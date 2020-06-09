import java.util.ArrayList;

public class PacienteTeste {
	
	public static void main(String[] args) {
		//Teste
		ArrayList<Paciente> listadePacientes = new ArrayList<Paciente>();

		listadePacientes.add(new PacienteBasico("João", false));
		listadePacientes.add(new PacienteBasico("Mario", true));
		listadePacientes.add(new PacienteExecutivo("Maria", true));
		listadePacientes.add(new PacienteExecutivo("Pedro", false));
		
		System.out.println("Pacientes: ");
		
		for(Paciente pac : listadePacientes){

			System.out.println("\nNome: "+pac.name);
			System.out.println("Covid: " + (pac.temCovid() ? "Positivo" : "Negativo"));
			System.out.println("Tipo de Plano: "+ pac.tipoPlano);
			System.out.println("Tipo de enfermaria "+ pac.enfermaria);
		}

	}
	
}