/* class Carro {
  - cilindraje: int
  - tipoCombustible: String
  + Carro(marca, modelo, año, cilindraje, tipoCombustible)
  + calcularConsumo(km: double): double
  + mostrarInfo(): void
} */

public class Carro {
    super(marca, modelo, año);
    private int cilindraje;
    private String tipoCombustible;

    public Carro(String marca, String modelo, String año, String cilindraje, String tipoCombustible) {
        super(marca, modelo, año);
        this.cilindraje = 1800;
        this.tipoCombustible = tipoCombustible;

    }
    public calcularConsumo(double km) {
        this.km += 10.0;
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.año);
        System.out.println("cilindraje: " + this.cilindraje);
        System.out.println("tipoCombustible: " + this.tipoCombustible);
    }
    
    
    
    }