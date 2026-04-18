package lab;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String urlBase;
    private int puerto;
    private int timeout;

    private ConfiguracionSistema() {
        this.urlBase = "http://localhost:8080";
        this.puerto = 8080;
        this.timeout = 30;
    }

    public static synchronized ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public int getPuerto() {
        return puerto;
    }

    public int getTimeout() {
        return timeout;
    }
}