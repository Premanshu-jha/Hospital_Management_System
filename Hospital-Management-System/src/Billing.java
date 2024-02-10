public class Billing {
   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        // your logic 
        if(patientInsurancePlan!=null){
        payments[0] = patientInsurancePlan.getCoverage()*amount;
        
        payments[1] = amount - payments[0];
        
        
        if(patientInsurancePlan instanceof PlatinumPlan) payments[1] = payments[1] - 50;
        
        else if(patientInsurancePlan instanceof GoldPlan) payments[1] = payments[1] - 40;
        
        else if(patientInsurancePlan instanceof SilverPlan) payments[1] = payments[1] - 30;
        
        else if(patientInsurancePlan instanceof BronzePlan) payments[1] = payments[1] - 25;
        
        
        }
        else{
            payments[0] = 0;
            payments[1] = amount - 20;
        }

        return payments;
    }

}