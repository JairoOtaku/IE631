package Pojos;
// Generated 17-nov-2016 10:58:35 by Hibernate Tools 4.3.1



/**
 * AsigNota generated by hbm2java
 */
public class AsigNota  implements java.io.Serializable {


     private AsigNotaId id;
     private int nota;

    public AsigNota() {
    }

    public AsigNota(AsigNotaId id, int nota) {
       this.id = id;
       this.nota = nota;
    }
   
    public AsigNotaId getId() {
        return this.id;
    }
    
    public void setId(AsigNotaId id) {
        this.id = id;
    }
    public int getNota() {
        return this.nota;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }




}

