public class PacienteTeste {
	
	public static void main(String[] args) {
		
		PacienteBasico p1 = new PacienteBasico("João", false);
		PacienteBasico p2 = new PacienteBasico("Mario", true);
		
		PacienteExecutivo e1 = new PacienteExecutivo("Maria", true);
		PacienteExecutivo e2 = new PacienteExecutivo("Pedro", false);
		
		System.out.println(p1.name);
		System.out.println(p1.temCovid());
		System.out.println(p1.tipoPlano);
		System.out.println(p1.enfermaria);
		System.out.println(p2);
		System.out.println(e1);
		System.out.println(e2);
	}
	
}