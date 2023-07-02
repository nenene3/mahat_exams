import java.util.Random;

public class qweqwe {
    public static void main(String[] args) {
        int[] arr = new int[89];
        int[] arrNeg = new int[89];
        Random random= new Random();
        boolean didNotPlace=true;
        for(int i=0;i<21;i++){
            didNotPlace=true;
            if(random.nextBoolean())
                do{
                    int position = random.nextInt(90);
                    if(arr[position]==0){
                        didNotPlace=false;
                        arr[position]++;
                    }
                }while(didNotPlace);
            else{
                do{
                    int position = random.nextInt(90);
                    if(arr[position]==0){
                        didNotPlace=false;
                        arr[position]++;
                    }
                }while(didNotPlace);
            }
        }
        int counter=0;
        for(int i=arrNeg.length-1;i>=0;i--){
            if(arrNeg[i]!=0){
                counter++;
            }
            if(counter==11){
                System.out.println(-i-10);
                break;
            }
        }
        if(counter!=11){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    counter++;
                }
                if(counter==11){
                    System.out.println(i+10);
                    break;
                }

            }
        }

    }
}
