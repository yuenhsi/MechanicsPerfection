package ftl.mechanicsperfection;

import java.util.UUID;

public class Mechanic {

    private UUID mId;
    private String mTitle;

//    We may not need to instantiate a Mechanic class that's lacking a title
//    public Mechanic() {
//        this.mId = UUID.randomUUID();
//    }

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

    private void setTitle(String title) {
        this.mTitle = title;
    }
}
