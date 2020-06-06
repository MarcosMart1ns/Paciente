public abstract class Paciente {
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