import java.util.LinkedHashMap;
import java.util.Map;

/*
 Mantiene en memoria los perfiles de usuarios recientes.
 Cuando llega al límite, elimina el más antiguo.
 */
public class UserCache {
 
    private int maxSize;
    private Map<String, UserProfile> cache;
 
    public UserCache(int maxSize) {
        this.maxSize = maxSize;
        this.cache = new LinkedHashMap<>();
    }
 
    public UserProfile getUser(String userId) {
        return cache.getOrDefault(userId, null);
    }
 
    public void addUser(UserProfile user) {
        if (cache.size() >= maxSize) {
            removeOldest();
        }
        cache.put(user.getId(), user);
        System.out.println("Usuario " + user.getId() + " guardado en caché.");
    }
 
    public boolean contains(String userId) {
        return cache.containsKey(userId);
    }
 
    public void removeOldest() {
        String oldestKey = cache.keySet().iterator().next();
        cache.remove(oldestKey);
        System.out.println("Caché lleno, se saca al usuario " + oldestKey + " para dar espacio.");
    }
}