package my.home.bootrepository.demo.model;

public enum Permission {
    DEVELOPER_READ("developers:read"),
    DEVELOPER_WRITE("developer:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
