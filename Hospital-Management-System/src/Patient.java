public class Patient extends User {
   // code from previous exercise
   private long patientId;
    private boolean insured;
    
   
   HealthInsurancePlan insurancePlan;
   
   
   public long getPatientId(){
        return patientId;
    }
    
    public void setPatientId(long patientId){
        super.setId(patientId);
    }
    
    public boolean isInsured(){
        return insured;
    }
    
    public void setInsured(boolean insured){
        this.insured = insured;
    }
   
   public HealthInsurancePlan getInsurancePlan(){
       return insurancePlan;
   }
   
   public void setInsurancePlan(HealthInsurancePlan insurance){
       this.insurancePlan = insurance;
   }
   
   
}