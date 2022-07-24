public class Professor extends Pessoa{
    private String especialidadade;
    private float salario;

    public void receberSalario(float aumento){
        this.salario+=aumento;
    }
    public String getEspecialidadade() {
        return especialidadade;
    }
    public void setEspecialidadade(String especialidadade) {
        this.especialidadade = especialidadade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
