package b2021Aviv.ex3;

public class library {
    private Book[] bookArr;
    private int[] copyArr;
    private int current;
    public library(){
        this.bookArr=new Book[2000];
        this.copyArr=new int[2000];
        this.current=0;
    }
    public int bookPosition(Book b){
        for(int i=0;i< this.current;i++)
            if(this.bookArr[i].isSameBook(b))
                return i;

        return -1;
    }
    public void add(Book b){
//        for(int i=0;i<this.current;i++)
//            if(this.bookArr[i].isSameBook(b)) {
//                this.copyArr[i]++;
//                return;
//            }
        int d=this.bookPosition(b);
        if(d!=-1){
            this.copyArr[d]++;
            return;
        }
        if(current<2000)
            this.bookArr[this.current++]=b;
        System.out.println("not added");
    }

}
