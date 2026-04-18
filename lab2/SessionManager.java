/*
 Coordina las acciones de los usuarios en el sistema.
 Simula múltiples solicitudes de distintos usuarios interactuando
 con la aplicación web de forma concurrente.
 */
public class SessionManager {
 
    private UserService userService;
 
    public SessionManager() {
        this.userService = new UserService();
    }
 
    public void simulate() {
        String[][] acciones = {
            {"U001", "abre el dashboard"},
            {"U002", "entra al editor"},
            {"U001", "navega a su perfil"},
            {"U003", "revisa los reportes"},
            {"U002", "guarda un documento"},
            {"U004", "entra al panel de usuario"},
            {"U001", "hace otra accion"},
        };
 
        for (String[] accion : acciones) {
            String userId = accion[0];
            String evento = accion[1];
 
            System.out.println("El usuario " + userId + " " + evento + ".");
 
            long inicio = System.currentTimeMillis();
            UserProfile perfil = userService.getUser(userId);
            long fin = System.currentTimeMillis();
 
            if (perfil != null) {
                System.out.println("  Perfil: " + perfil);
            }
            System.out.println("  Tardo: " + (fin - inicio) + " ms\n");
        }
    }
}
