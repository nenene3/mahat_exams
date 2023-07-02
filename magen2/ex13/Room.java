package magen2.ex13;

public class Room {



    private int roomNum;
    private int roomType;
    private int nights;

    public Room(int roomNum, int roomType, int nights) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.nights = nights;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}
