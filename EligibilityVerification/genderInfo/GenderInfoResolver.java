package EligibilityVerification.genderInfo;

public class GenderInfoResolver {
	
	private String male = "male";
	
	public GenderInfo resolve(String gender, String heightUnits) {
		if(gender.equalsIgnoreCase(male)) {
			return new MaleGenderInfo(heightUnits);
		}
		return new FemaleGenderInfo(heightUnits);
	}
}
