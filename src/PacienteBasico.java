public class PacienteBasico extends Paciente{
    

    public PacienteBasico(String nome,boolean cov_19){
        this.name = nome;
        this.covid = cov_19;
        this.tipoPlano = "Básico";
        super.defineEnfermaria();
    }
    
}