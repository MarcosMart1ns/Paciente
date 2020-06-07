//Classe abstrata para ser usada como herança

public abstract class Paciente {
    //Atributos que serão herdados

    public String name;
    protected String enfermaria;
    protected boolean covid;
    protected String tipoPlano;

    protected boolean temCovid(){
        return covid;
    }

    protected void defineEnfermaria(){
        this.enfermaria = "Compartilhado";
    }

}