package modelo;
public class Estudiante{
    public String nombre, apellido;
    public double nota1, nota2, promedio;

    public Estudiante(String nombre, String apellido, double nota1, double nota2){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public String convertirMayuscula(String palabra){
        char[] mayuscula = new char[palabra.length()];

        for(int i = 0; i < mayuscula.length; i++){
            if(palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z')
                mayuscula[i] = (char)(palabra.charAt(i) - 32);
            else mayuscula[i] = palabra.charAt(i);
        }
        this.nombre = new String(mayuscula);
        return "Mayuscula: " + this.nombre;
    }
    public String convertirMinuscula(String palabra){
        char[] minuscula = new char[palabra.length()];

        for(int i = 0; i < minuscula.length; i++){
            if(palabra.charAt(i) >= 'A' && palabra.charAt(i) <= 'Z')
                minuscula[i] = (char)(palabra.charAt(i) + 32);
            else minuscula[i] = palabra.charAt(i);
        }
        this.apellido = new String(minuscula);
        return "Minuscula: " + new String(minuscula);
    }
    public String procesarPromedio(){
        this.promedio = (nota1 + nota2) / 2;

        if(promedio >= 12) return promedio + " Felicidades usted a aprobado!";
        else return promedio + " Desaprobo intnte de nuevo!";
    }
}