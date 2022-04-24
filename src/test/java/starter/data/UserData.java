package starter.data;

public enum UserData {
    EMAIL("hepiv39529@royins.com"),
    PASSWORD("MyP@ssw0rd");

    public final String userData;

    UserData(String userData) {
        this.userData = userData;
    }

    public String value() {
        return this.userData;
    }
}


