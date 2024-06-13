package modelo;
public class Texto {
    public String saludoInicial, saludoFinal;

    public Texto(String saludoInicial){
        this.saludoInicial = saludoInicial;
    }
    public String convertirSaludoMayuscula(String palabra){
        char[] mayuscula = new char[palabra.length()];

        for(int i = 0; i < mayuscula.length; i++){
            if(palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z')
                mayuscula[i] = (char)(palabra.charAt(i) - 32);
            else mayuscula[i] = palabra.charAt(i);
        }
        this.saludoFinal = new String(mayuscula);
        return "Saludo en Mayuscula: " + this.saludoFinal;
    }

    public String longitudSaludo(){
        return "Longitud del saludo: " + saludoInicial.length();
    }
}