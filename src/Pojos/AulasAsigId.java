package Pojos;
// Generated 17-nov-2016 10:58:35 by Hibernate Tools 4.3.1

/**
 * AulasAsigId generated by hbm2java
 */
public class AulasAsigId implements java.io.Serializable {

    private String dniPro;
    private int codAsig;
    private int codAula;

    public AulasAsigId() {
    }

    public AulasAsigId(String dniPro, int codAsig, int codAula) {
        this.dniPro = dniPro;
        this.codAsig = codAsig;
        this.codAula = codAula;
    }

    public String getDniPro() {
        return this.dniPro;
    }

    public void setDniPro(String dniPro) {
        this.dniPro = dniPro;
    }

    public int getCodAsig() {
        return this.codAsig;
    }

    public void setCodAsig(int codAsig) {
        this.codAsig = codAsig;
    }

    public int getCodAula() {
        return this.codAula;
    }

    public void setCodAula(int codAula) {
        this.codAula = codAula;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof AulasAsigId)) {
            return false;
        }
        AulasAsigId castOther = (AulasAsigId) other;

        return ((this.getDniPro() == castOther.getDniPro()) || (this.getDniPro() != null && castOther.getDniPro() != null && this.getDniPro().equals(castOther.getDniPro())))
                && (this.getCodAsig() == castOther.getCodAsig())
                && (this.getCodAula() == castOther.getCodAula());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getDniPro() == null ? 0 : this.getDniPro().hashCode());
        result = 37 * result + this.getCodAsig();
        result = 37 * result + this.getCodAula();
        return result;
    }

}
