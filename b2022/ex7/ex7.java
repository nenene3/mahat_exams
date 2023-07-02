package b2022.ex7;

public class ex7 {
    public static void main(String[] args) {

    }
    public static  String[] improved(Student[] arr){
        int counter=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i].isImproved())
                counter++;
        if(counter==0)
            return null;
        String[] improve = new String[counter];
        counter=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i].isImproved())
                improve[counter++]=arr[i].getId();

        return improve;
    }
}
