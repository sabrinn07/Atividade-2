
package pacotinho;

public class Conversor {
    //ATRIBUTOS
    private double quantReal;
    private double cambioDolar;
    private double cambioEuro;
    private double valor;

    //CONSTRUTOR
    public Conversor(){

    }
    //METODOS
    public double converter(double r, String moeda){
        quantReal = r;
        if (moeda == "dolar"){
            valor = quantReal*cambioDolar;
        }
        if (moeda == "euro"){
            valor = quantReal*cambioEuro;
        }
        switch (moeda){
            case "dolar":
                valor = quantReal*cambioDolar;
                break;
            case "euro":
            valor = quantReal*cambioEuro;
                break;
        }
        return valor;

}
}