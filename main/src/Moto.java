/*  class Moto {
  - cilindrada: int
  - esSportiva: boolean
  + Moto(marca, modelo, año, cilindrada, esSportiva)
  + final calcularConsumo(km: double): double
  + mostrarInfo(): void
} */

public class Moto {
        private String marca;
        private String modelo;
        private int año;
        private int cilindrada;
        private boolean esSportiva;

    public Moto(String marca, String modelo, int año, int cilindrada, boolean esSportiva){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año; 
        this.cilindrada = 180;
        this.esSportiva = esSportiva;
    }
    public final double calcularConsumo(double km){
        this.km += 10.0;
        return this.km;
    }
    public void mostrarInfo() {  
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.año);
        System.out.println("Cilindrada: " + this.cilindrada + " cc");
        System.out.println("Es deportiva: " + (this.esSportiva ? "Sí" : "No"));
    }

}
