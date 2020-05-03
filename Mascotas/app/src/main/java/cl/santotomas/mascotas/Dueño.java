package cl.santotomas.mascotas;

public class Dueño {
    private String nombreD;
    private String apellidoD;
    private String nombreM;
    private String edadM;

    public Dueño(String nombreD, String apellidoD, String nombreM, String edadM) {
        this.nombreD = nombreD;
        this.apellidoD = apellidoD;
        this.nombreM = nombreM;
        this.edadM = edadM;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getApellidoD() {
        return apellidoD;
    }

    public void setApellidoD(String apellidoD) {
        this.apellidoD = apellidoD;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getEdadM() {
        return edadM;
    }

    public void setEdadM(String edadM) {
        this.edadM = edadM;
    }

    @Override
    public String toString() {
        return "RegistroMascosta{" +
                "nombreD='" + nombreD + '\'' +
                ", apellidoD='" + apellidoD + '\'' +
                ", nombreM='" + nombreM + '\'' +
                ", edadM='" + edadM + '\'' +
                '}';
    }
}
