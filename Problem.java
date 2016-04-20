import EligibilityVerification.Verifier;
import EligibilityVerification.genderInfo.GenderInfoResolver;

public class Problem {
	public Problem() {}
    /**
      This programs checks the eligibility of people trying to register for a Study
      You wont find any detailed specs here :p
     */
	
    public  Boolean verifyEligibility(String gender, Integer age, Float height, String heightUnit) {
        return new Verifier(new GenderInfoResolver().resolve(gender, heightUnit)).verify(height, age);
    }
    
    
    /* before refactor*/
    
    /*

       if(age > 18) {
	        if(gender.equalsIgnoreCase("male")){
	          if(age < 50) {
	            if(heightUnit.equalsIgnoreCase("ft")) {
	              if(height < 5 || height > 6.5) {
	                return false;
	              }else {
	                return true;
	              }
	            }else if(heightUnit.equalsIgnoreCase("m")) {
	              if(height < 1.524 || height > 1.981){
	                return false;
	              }else {
	                return true;
	              }
	            }
	          }else {
	            return false;
	          }
	        }else if(gender.equalsIgnoreCase("female")) {
	          if(age < 60) {
	            if(heightUnit.equalsIgnoreCase("ft")) {
	              if(height < 4.5 || height > 6) {
	                return false;
	              }else {
	                return true;
	              }
	            }else if(heightUnit.equalsIgnoreCase("m")) {
	              if(height < 1.372 || height > 1.829){
	                return false;
	              }else {
	                return true;
	              }
	            }
	          }else {
	            return false;
	          }          
	        }
	      }else {
	        return false;
	      }
	      return false;
	    }

     */
    
    
}