
public class StandingInstructionDemo {

	public static void main(String[] args) {
		StandingInstructionDemo obj = new StandingInstructionDemo();
		obj.standingInstructionCheck();
	}

	public void standingInstructionCheck() {
		try {
			if (siAvaibale()) {
				
				delete();
				createSI();
			} else {
				
				// if SI not available create SI
				createSI();
			}
		} catch (Exception e) {
		}
	}

	public boolean siAvaibale() {
		// you logic which will tell whether SI is available or not
		// return false;
		return true;
	}

	protected void delete() {
		System.out.println("..SI Deleted...");
	}

	protected void createSI() {
		System.out.println("..SI Created...");
	}
}
