/*
 Servicio principal de usuarios.
 Decide si el perfil se obtiene del caché o de la base de datos.
 Si el usuario está en caché: retorna inmediatamente.
 Si no está en caché:
 1. Consulta UserRepository
 2. Guarda el resultado en UserCache
 3. Retorna UserProfile
 */
public class UserService {
 
    private UserCache cache;
    private UserRepository repository;
 
    public UserService() {
        this.cache      = new UserCache(3);
        this.repository = new UserRepository();
    }
 
    public UserProfile getUser(String userId) {
        if (cache.contains(userId)) {
            System.out.println("Ya estaba en caché, respuesta inmediata.");
            return cache.getUser(userId);
        }
 
        System.out.println("No está en caché, hay que ir a la base de datos...");
        UserProfile profile = repository.loadUser(userId);
 
        if (profile != null) {
            cache.addUser(profile);
        } else {
            System.out.println("No existe ningún usuario con id: " + userId);
        }
 
        return profile;
    }
}