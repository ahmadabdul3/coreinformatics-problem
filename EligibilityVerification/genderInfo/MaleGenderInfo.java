package EligibilityVerification.genderInfo;
import java.util.HashMap;

public class MaleGenderInfo implements GenderInfo {
	
	String minBound = "min-bound";
	String maxBound = "max-bound";
	String meters = "m";
	String feet = "ft";
	Float meterMinBound = new Float(1.524);
	Float meterMaxBound = new Float(1.981);
	Float feetMinBound = new Float(5);
	Float feetMaxBound = new Float(6.5);
	
	HashMap<String, Float> heightUnitValues = new HashMap<>();
	
	public MaleGenderInfo() {}
	public MaleGenderInfo(String heightUnits) {
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
		return 50;
	}

}
