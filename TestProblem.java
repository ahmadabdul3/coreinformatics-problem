import java.util.Random;

import org.approvaltests.Approvals;
import org.junit.Before;
import org.junit.Test;

public class TestProblem {
// Do not change these variables
private static final int FIXED_SEED = 1001;
private static final int TEST_SIZE = 1000;
private  Random random = new Random(FIXED_SEED);
private Problem problem;
/**
* @param args
*/
@Before
public void initialise() {
  problem = new Problem();
}
@Test public void 
should_generate_output() {
       StringBuilder output = new StringBuilder();
        
        for(int count = 0; count < TEST_SIZE ; count++) {
          // Randoms need to be retrieved in this order(for the seed to work)
          // aka variables may be changed, but the call order needs to be (gender, age, heightUnit, height, eligible)
          String gender = getRandomGender();
          Integer age = getRandomAge();
          String heightUnit = getRandomHeightUnit();
          Float height = getRandomHeight(heightUnit);
          Boolean eligible = problem.verifyEligibility( gender,  age,  height,  heightUnit );
          
          // Feel free to change this from a StringBuilder of concats to anything else that outputs the EXACT same thing.
          output.append(" gender: " + gender + " age: " + age + " height: " + height + " heightUnit: " + heightUnit + " eligible: "+ eligible + " \n"); 
        }
        try {
          Approvals.verify(output.toString());
        } catch (Exception e) {
          e.printStackTrace();
        }
}

// Do not change these methods
public  String getRandomGender() {
  int gender = randomIntBetween(0,2);
  if(gender > 0) {
    return "male";
  }else {
    return "female";
  }
}

public  int getRandomAge() {
  return randomIntBetween(0,90);
}

public  String getRandomHeightUnit() {
  int hUnit = randomIntBetween(0,2);
  if(hUnit > 0) {
    return "m";
  }else {
    return "ft";
  }
}

public  Float getRandomHeight(String unit) {
  if(unit.equalsIgnoreCase("ft")) {
    return randomFloatBetween(4,7);
  }else{
    return randomFloatBetween(1,2);
  }

}

public  int randomIntBetween(int minimum, int maximum) {
  return minimum + random.nextInt(maximum);
}
public  Float randomFloatBetween(int minimum, int maximum) {
  return minimum + (random.nextFloat() * maximum);
}
}