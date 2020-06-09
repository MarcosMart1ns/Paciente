public class PacienteExecutivo extends Paciente {
    
    public PacienteExecutivo(String nome,boolean cov_19){
        this.name = nome;
        this.covid = cov_19;
        this.tipoPlano = "Executivo";

        defineEnfermaria();
    }

    public PacienteExecutivo(String nome){
        this.name = nome;
        this.covid = false;
        this.tipoPlano = "Executivo";

        defineEnfermaria();
    }
//Polimorfismo e reescrita, pois o mesmo método existe na superclasse, porém retorna valores diferentes e aqui ele é reescrito retornando outros valores.
    protected void defineEnfermaria(){
        this.enfermaria = "Individual";
    }
}
