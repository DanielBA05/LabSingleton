package lab;

public class ModuloB {

    public void mostrarConfiguracion() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();

        System.out.println("Modulo B");
        System.out.println("URL: " + config.getUrlBase());
        System.out.println("Puerto: " + config.getPuerto());
        System.out.println("Hash: " + System.identityHashCode(config));
        System.out.println();
    }
}