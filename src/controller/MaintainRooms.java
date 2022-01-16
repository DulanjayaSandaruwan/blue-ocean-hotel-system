package controller;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 06/07/2021
 **/
public class MaintainRooms {
    private String maintainingRoom;

    public MaintainRooms() {
    }

    public MaintainRooms(String maintainingRoom) {
        this.maintainingRoom = maintainingRoom;
    }

    public String getMaintainingRoom() {
        return maintainingRoom;
    }

    public void setMaintainingRoom(String maintainingRoom) {
        this.maintainingRoom = maintainingRoom;
    }

    @Override
    public String toString() {
        return "MaintainRooms{" +
                "maintainingRoom='" + maintainingRoom + '\'' +
                '}';
    }
}
