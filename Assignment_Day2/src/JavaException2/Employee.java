package JavaException2;

public class Employee {
	int[] presentdays;
	double salaryPerMonth;
	// P for present, L for leave it will be paid leave, A for absent,
	// N for no information about this day.
	char[] inputStatus = { 'P', 'P', 'P', 'P', 'N', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P',
			'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' };
	int totalPresentDays;
	int totalLeavesPerMonth;
	int totalAbsentDays;
	final int leaves = 2;
	int noInfo;

	void Attendace() {
		System.out.println("attendance for previous month is: ");
		for (int i = 0; i <= inputStatus.length-1; i++) {
			if (inputStatus[i] == 'P') {
				totalPresentDays++;
			} else if (inputStatus[i] == 'L') {
				totalLeavesPerMonth++;
			} else if (inputStatus[i] == 'A') {
				totalAbsentDays++;
			} else {
				noInfo++;
			}
		}
		try {
			if (totalLeavesPerMonth > leaves) {
				throw new LeaveExceedLimitException("Your salary will be deducted as per policy");
			}
			if(noInfo>4)
			{
				throw new EmployeeAbscondingException("No information provided for 4 continuos days, hence you salary "
						+ "will not be calculated.");
			}
		} catch (LeaveExceedLimitException l) {
			System.out.println(l.getMessage());
		} catch (EmployeeAbscondingException e) {
			e.getMessage();
		}
		System.out.println(totalPresentDays);
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.Attendace();
	}
}
