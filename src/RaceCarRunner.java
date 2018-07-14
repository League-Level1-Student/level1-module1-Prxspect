

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar mcqueen = new RaceCar("nike", 5);
	
// 2. Print the RaceCar's position in the race
mcqueen.getPositionInRace();
		// 3. Crash the RaceCar
		mcqueen.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
mcqueen.pit();
		// 5. Help the car move into first place.
mcqueen.overtake();
mcqueen.overtake();
mcqueen.overtake();
mcqueen.overtake();
mcqueen.overtake();
mcqueen.overtake();
mcqueen.overtake();
	}
}
	
