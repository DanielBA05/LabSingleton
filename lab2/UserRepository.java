import java.util.HashMap;
import java.util.Map;

/**
 Carga perfiles de usuario desde la base de datos externa del sistema.
 El acceso tiene latencia real, representada con una pausa de 3 segundos.
 */
public class UserRepository {
 
    private static final Map<String, UserProfile> DATABASE = new HashMap<>();
 
    static {
        DATABASE.put("U001", new UserProfile("U001", "Daniel Barboza", "Admin",  "tema=oscuro, idioma=es"));
        DATABASE.put("U002", new UserProfile("U002", "Ana Pérez",      "Editor", "tema=claro, idioma=es"));
        DATABASE.put("U003", new UserProfile("U003", "Carlos Mora",    "Viewer", "tema=oscuro, idioma=en"));
        DATABASE.put("U004", new UserProfile("U004", "Lucía Quesada",  "Editor", "tema=claro, idioma=es"));
    }
 
    public UserProfile loadUser(String userId) {
        System.out.println("  Buscando usuario " + userId + " en la base de datos...");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return DATABASE.getOrDefault(userId, null);
    }
}