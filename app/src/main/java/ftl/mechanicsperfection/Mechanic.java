package ftl.mechanicsperfection;

import java.util.UUID;

public class Mechanic {

    private UUID mId;
    private String mTitle;

    public Mechanic() {
        this.mId = UUID.randomUUID();
    }

    public Mechanic(String title) {
        this.mId = UUID.randomUUID();
        this.mTitle = title;
    }

    public UUID getID() {
        return this.mId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
