package b2022a.ex7;

public class Main {
    public static void main(String[] args) {


    }



    public static void print(sportUnion[] arr){

        int sum=0;
        for(int i=0;i< arr.length;i++)
            if(arr[i].getNumberUnion()>=5 ){

                for(int j=0;i<arr[i].getUnionData().length;i++)
                  sum+=arr[i].getUnionData()[i].getCountOFPlayer();

                if(sum>=50)
                    System.out.println(arr[i].getUnionName());

            }

    }
}
