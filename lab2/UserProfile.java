/*
 Representa el perfil de un usuario en el sistema.
 */
public class UserProfile {
    private String id;
    private String name;
    private String role;
    private String preferences;
 
    public UserProfile(String id, String name, String role, String preferences) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.preferences = preferences;
    }
 
    public String getId()          { return id; }
    public String getName()        { return name; }
    public String getRole()        { return role; }
    public String getPreferences() { return preferences; }
 
    @Override
    public String toString() {
        return name + " (id: " + id + ", rol: " + role + ", preferencias: " + preferences + ")";
    }
}
