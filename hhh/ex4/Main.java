package hhh.ex4;

public class Main {
    public static void main(String[] args) {

        Box arr= new Box("black",1,1,1);
        Box arr1= new Box("black",1,1,1);
        Box arr2= new Box("black",1,1,1);
        Box arr3= new Box("white",1,1,1);
        Box arr4= new Box("white",1,1,1);
        Box arr5= new Box("white",1,1,1);
        Box arr6= new Box("yellow",1,1,1);
        Box[] aaaa = {arr1,arr2,arr3,arr4,arr5,arr,arr6};
        System.out.println(isBlackWhite(aaaa));
    }
    public static boolean isBlackWhite(Box[] arr){
        int white=0;
        int black=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i].getColor().equals("white"))
                white++;
            if(arr[i].getColor().equals("black"))
                black++;
            if(!arr[i].getColor().equals("black") && !arr[i].getColor().equals("white"))
                return false;
        }

        return white!=0 && black!=0;
    }
}
