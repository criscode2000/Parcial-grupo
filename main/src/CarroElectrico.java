/*  class CarroElectrico {
  - capacidadBateria: double
  - autonomiaKm: double
  + CarroElectrico(marca, modelo, año, capacidadBateria, autonomiaKm)
  + calcularConsumo(km: double): double
  + mostrarInfo(): void
  + cargarBateria(): void
} */

public class CarroElectrico {
    super(marca, modelo, año);
    private double capacidadBateria;
    private double autonomiaKm;

    public CarroElectrico(String marca, String modelo, int año, double capacidadBateria, double autonomiaKm) {
        super(marca, modelo, año);
        this.capacidadBateria = capacidadBateria;
        this.autonomiaKm = autonomiaKm;

    }
    public void calcularConsumo(double km) {
        this.km += 10.0;
    }
    public void cargarBateria() {
        this.capacidadBateria = 100.0;
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.año);
        System.out.println("Capacidad de batería: " + this.capacidadBateria + " kWh");
        System.out.println("Autonomía: " + this.autonomiaKm + " km");
    }
    
}
