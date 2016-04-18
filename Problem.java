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
    
    
}