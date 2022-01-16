package controller;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 05/07/2021
 **/
public class Room {
    private String newRoomId;
    private String modifyingRoomID;

    public Room() {
    }

    public Room(String newRoomId, String modifyingRoomID) {
        this.newRoomId = newRoomId;
        this.modifyingRoomID = modifyingRoomID;
    }

    public Room(String newRoomId) {
        this.newRoomId = newRoomId;
    }

    public String getNewRoomId() {
        return newRoomId;
    }

    public void setNewRoomId(String newRoomId) {
        this.newRoomId = newRoomId;
    }

    public String getModifyingRoomID() {
        return modifyingRoomID;
    }

    public void setModifyingRoomID(String modifyingRoomID) {
        this.modifyingRoomID = modifyingRoomID;
    }

    @Override
    public String toString() {
        return "Room{" +
                "newRoomId='" + newRoomId + '\'' +
                ", modifyingRoomID='" + modifyingRoomID + '\'' +
                '}';
    }
}
