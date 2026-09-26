public class College {
     String type;
     int year ;
     double fee;

      public  College(String type,int year,double fee){
          this.type=type;
          this.year=year;
          this.fee= fee;

      }
 public void ShowDetails(){
     System.out.println("Type:"+type);
     System.out.println("Year:"+year);
     System.out.println("Fees:"+fee);
 }





public static void main(String[] args) {
    College UTU = new College("Government",2005,20000);
    UTU.ShowDetails();
}}