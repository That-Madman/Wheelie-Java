package Wheelie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Pose2dTest {
	@Test void Getter_Setter () { //just try to see if the getters/setters work
		Pose2D pose = new Pose2D (0, 0, 0);
		assertNotNull (pose, "Pose should not be Null"); //pose was initialized, so it shouldn't be null

		pose.setX (5);
		assertTrue (5 == pose.getX(), "X should be 5"); //testing getter/setter for x
		
		pose.setY (5);
		assertTrue (5 == pose.getY(), "Y should be 5"); //ditto for y

		pose.setH (5);
		assertTrue (5 == pose.getH(), "The Heading should be 5"); //ditto again for h

		pose = new Pose2D (7.0, 7.0); //checking if reinitialization works

		assertTrue (7 == pose.getX(), "X should be 7.");
		assertTrue (7 == pose.getY(), "Y should be 7."); //check x and y were set properly

		assertTrue (0 == pose.getH(), "The heading should be 0."); //H should have been reset
	}
}
