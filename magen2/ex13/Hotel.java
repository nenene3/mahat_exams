package magen2.ex13;

public class Hotel {
    private final Room[] rooms = new Room[200];

    public Room[] getRooms() {
        return rooms;
    }
    public int findRoom(int type,int nights){
        int[] prices={0,500,800};
        for(int i=0;i<this.rooms.length;i++){
            if(this.rooms[i].getRoomType()==type && this.rooms[i].getNights()==0){
                this.rooms[i].setNights(nights);
                return prices[type]*nights;
            }
        }



        return -1;
    }
    public int[] getTom(int floor){
        int index=0;
        int[] arr= new int[this.rooms.length];
        for(int i=0;i< arr.length;i++){
            if(floor==this.rooms[i].getRoomNum()/100 && 1==this.rooms[i].getNights()){
                arr[index++]=this.rooms[i].getRoomNum();
            }
        }
        return arr;
    }



    public int[] getTom2(int floor){
        int size = 0;
        for(int i=0;i< this.rooms.length;i++){
            if(floor==this.rooms[i].getRoomNum()/100 && 1==this.rooms[i].getNights()){
                size++;
            }
        }



        int[] arr= new int[size];

        for(int i=0,index=0;i< arr.length;i++){
            if(floor==this.rooms[i].getRoomNum()/100 && 1==this.rooms[i].getNights()){
                arr[index++]=this.rooms[i].getRoomNum();
            }
        }
        return arr;
    }
}
