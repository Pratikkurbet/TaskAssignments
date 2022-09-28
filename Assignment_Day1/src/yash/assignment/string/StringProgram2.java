package yash.assignment.string;

public class StringProgram2 {
	public static void main(String[] args) throws Exception {
		String str = "ganesh";
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;

		// Assending
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println("String is:" + str);
		System.out.print("Asc:");
		System.out.println(arr);

		// Desc
		i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.print("Desc:");
		System.out.println(arr);
	}
}
