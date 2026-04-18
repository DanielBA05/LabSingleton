package lab;

public class Main {

    public static void main(String[] args) {

        ConfiguracionSistema instance1 = ConfiguracionSistema.getInstancia();
        ConfiguracionSistema instance2 = ConfiguracionSistema.getInstancia();

        System.out.println("Es la misma instancia?");
        System.out.println(instance1 == instance2);
        System.out.println();

        ModuloA a = new ModuloA();
        ModuloB b = new ModuloB();

        a.mostrarConfiguracion();
        b.mostrarConfiguracion();
    }
}