public class PacienteExecutivo extends Paciente {
    
    public PacienteExecutivo(String nome,boolean cov_19){
        this.name = nome;
        this.covid = cov_19;
        this.tipoPlano = "Executivo";

        defineEnfermaria();
    }

//Polimorfismo e reescrita, pois o mesmo método existe na superclasse, porém retorna valores diferentes e aqui ele é reescrito retornando outros valores.
    public void defineEnfermaria(){
        this.enfermaria = "Individual";
    }
}
