package EligibilityVerification.genderInfo;
import java.util.HashMap;

public class FemaleGenderInfo implements GenderInfo {
	
	String minBound = "min-bound";
	String maxBound = "max-bound";
	String meters = "m";
	String feet = "ft";
	Float meterMinBound = new Float(1.372);
	Float meterMaxBound = new Float(1.829);
	Float feetMinBound = new Float(4.5);
	Float feetMaxBound = new Float(6);
	
	HashMap<String, Float> heightUnitValues = new HashMap<>();
	
	public FemaleGenderInfo() {}
	public FemaleGenderInfo(String heightUnits) {
		if(heightUnits.equalsIgnoreCase(meters)) {
			heightUnitValues.put(minBound, meterMinBound);
			heightUnitValues.put(maxBound, meterMaxBound);
		} else {
	        heightUnitValues.put(minBound, feetMinBound);
	        heightUnitValues.put(maxBound, feetMaxBound);
		}
	}
	
	public Float getHeightMinBound() {
		return heightUnitValues.get(minBound);
	}
	public Float getHeightMaxBound() {
		return heightUnitValues.get(maxBound);
	}
	public Integer getMinAge() {
		return 18;
	}
	public Integer getMaxAge() {
		return 60;
	}

}
