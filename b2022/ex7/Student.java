package b2022.ex7;

public class Student {


    private String id;
    private int[] arrGradeSemesterA;
    private int[] arrGradeSemesterB;

    public boolean isImproved() {
        for (int i = 0; i < arrGradeSemesterA.length; i++) {


//        if (arrGradeSemesterA[i] == -1 || arrGradeSemesterB[i] != -1)
//            continue;


            if (arrGradeSemesterA[i] != -1 && arrGradeSemesterB[i] != -1 &&
                    arrGradeSemesterA[i] > arrGradeSemesterB[i])
                return false;
        }


        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getArrGradeSemesterA() {
        return arrGradeSemesterA;
    }

    public void setArrGradeSemesterA(int[] arrGradeSemesterA) {
        this.arrGradeSemesterA = arrGradeSemesterA;
    }

    public int[] getArrGradeSemesterB() {
        return arrGradeSemesterB;
    }

    public void setArrGradeSemesterB(int[] arrGradeSemesterB) {
        this.arrGradeSemesterB = arrGradeSemesterB;
    }
}
