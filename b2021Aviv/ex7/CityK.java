package b2021Aviv.ex7;

public class CityK {
   private String name;
   private int numOfResidents;
   private int numOfPatients;

   public CityK(String name, int numOfResidents, int numOfPatients) {
      this.name = name;
      this.numOfResidents = numOfResidents;
      this.numOfPatients = numOfPatients;
   }
   public boolean cityKSame(CityK other){
      return other.numOfPatients==this.numOfPatients;
   }
   public  String getCityColor(){
      double present= (double) (this.numOfPatients * 100) /this.numOfResidents;
      if(present>15)
         return "red";
      if(present>=5)
         return "orange";

      return "green";
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNumOfResidents() {
      return numOfResidents;
   }

   public void setNumOfResidents(int numOfResidents) {
      this.numOfResidents = numOfResidents;
   }

   public int getNumOfPatients() {
      return numOfPatients;
   }

   public void setNumOfPatients(int numOfPatients) {
      this.numOfPatients = numOfPatients;
   }
}
