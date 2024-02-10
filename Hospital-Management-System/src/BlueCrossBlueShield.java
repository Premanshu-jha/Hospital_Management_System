
public class BlueCrossBlueShield implements InsuranceBrand{
    
    	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		public double computeMonthlyPremium(HealthInsurancePlan plan,int age,boolean smoking){
		    double premium = 0;
		    if(plan instanceof PlatinumPlan){
		         if(age > 55) premium = premium + 200;
                 if(smoking) premium = premium + 100; 
		    }
		    
		     else if(plan instanceof GoldPlan){
		         if(age > 55) premium = premium + 150;
                 if(smoking) premium = premium + 90; 
		    }
		    
		    
		     else if(plan instanceof SilverPlan){
		         if(age > 55) premium = premium + 100;
                 if(smoking) premium = premium + 80; 
		    }
		    
		    
		     else if(plan instanceof BronzePlan){
		         if(age > 55) premium = premium + 50;
                 if(smoking) premium = premium + 70; 
		    }
		    
		  return premium;  
		  
		}
		
		public static void main(String[] args) {
		User staff = new User();                        
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();           
		HealthInsurancePlan insurancePlan = new PlatinumPlan(); 
 
		insurancePlan.setOfferedBy(insuranceBrand);
		staff.setInsurancePlan(insurancePlan);
		System.out.println(insurancePlan.computeMonthlyPremium(5000, 56, true));
	}
		
		
}
