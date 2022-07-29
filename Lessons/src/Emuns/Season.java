package Emuns;

public enum Season
 {
     WINTER(-10),SPRING(5),SUMMER(30),AUTUMN(10);
     private int temp;

     Season(int temp){
         this.temp=temp;
     }

     public int getTemp() {
         return temp;
     }
 }
