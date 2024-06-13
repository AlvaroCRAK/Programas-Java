package modelo;
public class Postulante {
    boolean sexo;
    int edad;

    public Postulante(boolean sexo, int edad){
        this.sexo = sexo;
        this.edad = edad;
    }
    public String Categoria(){
        String categoria;
        if( sexo ){
            if( edad >= 25 ) categoria = "MB";
            else categoria = "MA";
        }else {
            if( edad >= 23 ) categoria = "FB";
            else categoria = "FA";
        }

        return categoria  + "\n";
    }
}