public class PacienteExecutivo extends Paciente {
    
    public PacienteExecutivo(String nome,boolean cov_19){
        this.name = nome;
        this.covid = cov_19;
        this.tipoPlano = "Executivo";

        defineEnfermaria();
    }


    public void defineEnfermaria(){
        this.enfermaria = "Individual";
    }
}