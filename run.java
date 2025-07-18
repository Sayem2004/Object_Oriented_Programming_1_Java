class Doctor{
  public void treatPatient(){
  
}
}
class Surgeon extends Doctor{
  public void treatPatient(){
  }
}
class run{
  public static void main (String args[]){
    Doctor doctorObj = new Doctor();
    doctorObj.treatPatient();
   
    Surgeon surgeonObj = new Surgeon();
    surgeonObj.treatPatient();
  }
}