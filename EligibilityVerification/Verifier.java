package EligibilityVerification;

import EligibilityVerification.genderInfo.GenderInfo;

public class Verifier implements EligibilityVerifier {
	
	private GenderInfo genderInfo;
	
	public Verifier(GenderInfo genderInfo) {
		this.genderInfo = genderInfo;
	}
	
	private Boolean heightVerification(Float height) {
        if(height > genderInfo.getHeightMinBound() && height < genderInfo.getHeightMaxBound()) {
        	return true;
        }
        return false;
	}
	private Boolean ageVerification(Integer age) {
		if(age > genderInfo.getMinAge() && age < genderInfo.getMaxAge()) {
			return true;
		}
		return false;
	}
	public Boolean verify(Float height, Integer age) {
		if(ageVerification(age) && heightVerification(height)) {
			return true;
		}
		return false;
	}

}