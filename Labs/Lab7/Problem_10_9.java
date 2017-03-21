public class Problem_10_9 {

	public static void main(String[] args) {
		String[] currentStudents;
		Course course = new Course("Software Development");

		course.addStudent("Colin Salvato");
		course.addStudent("Kyle Berkowtiz");
		course.addStudent("Andrew Gerber");
		System.out.println("The students enrolled in the course: ");
		currentStudents = course.getStudents();

		for(int i=0; i<course.getNumberOfStudents(); i++)
			System.out.print(currentStudents[i]+",");
		System.out.println();

		course.dropStudent("Andrew Gerber");
		System.out.println("\n Andrew Gerber has been removed from the course.");

		System.out.println("\nThe remaining students in the course: ");
		currentStudents = course.getStudents();

		for(int i=0; i<course.getNumberOfStudents(); i++)
			System.out.print(currentStudents[i]+",");
		System.out.println();
	}
}
