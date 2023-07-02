package magen2.ex11;

public class AllWeight {
    private Weight[] arr;
    public Weight sum(){
        Weight ret= new Weight();
        for(int i=0;i< arr.length;i++)
            ret.add(arr[i]);
        return ret;
    }
}
