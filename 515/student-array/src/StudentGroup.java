import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		int Student[4]={k1,k2,k3,k4};
		if(Student==null)
			throw(illegalargumentexception);
		else
		     getStudents();
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		Student.length=(0,1,2,3);
		if(index<0)
			setStudent.length(index);
		else
			throw(illegalargumentexception);
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int Student[]={k1,k2,k3,k4};
		if(Student==null)
			throw(illegalargumentexception)
		else
			return Student(index);
		if(index<0)
			Student=getindexofStudent(Student);
		else
		   index=getStudent(index);
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
		Student=addStudent();
	else
		throw(illegalargumentexception);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		First=1,2;
		if(Student==null)
			throw(illegalargumentexception);
		else
			student=addFirst();
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Last=10;
		if(index<0)
			throw(illegalargumentexception);
		else
			Student=removeStudent(index);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		Student[]={k1,k2,k3,k4};
		if(Student==null)
			throw(illegalargumentexception);
		else
		    Student=addStudent(Student,index);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(Student==null)
			throw(illegalargumentexception);
		else
		    index=removeStudent(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(index<0)
			throw(illegalargumentexception);
		else
			Student=removeStudent(index);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(Student==null)
			throw(illegalargumentexception);
		else
		    index=removeStudent(index);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(index<0)
			throw(illegalargumentexception);
		else
			Student=removeStudent(index);
	}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(Student==null)
			throw(illegalargumentexception);
		else
		    index=removeStudent(index);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(index<0)
			throw(illegalargumentexception);
		else
			index=removeStudent(index);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		birth=10-04-1996;
		if(date==null)
			throw(illegalargumentexception);
		else if(date<=12)
			getStudentbirthdate();
		else
			throw(ileegalargumentexception);
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int first date,last date;
		if(firstDate==null)
			getByBirthFirstDate(Student);
		else
			throw(illegalargumentexception);
		else if(LastDate==null)
			getByBirthLastDate(Student);
		else
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		int Date=mm/dd/yy;
		int days[];
		if(Date==null)
			throw(illegalargumentexception);
		else if(days<=365)
			getBetweenBirthDate(Student);
		else
		    throw(illegalargumentexception);
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		int calculate;
		int years=12;
		if(indexofStudent==0)
			throw(illegalargumentexception);
		else if(indexofStudent<years)
			calculate=indexofStudent(Student);
		else
			throw(illegalargumentexception);
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		int age;
		if(age==currentage)
			getStudent(age);
		else
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		int avg mark;
		if(Student<avg mark)
			return avg mark(Student);
		else if(Student==avg mark)
			avg mark=maximum(Student []);
		else
		    return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		if(Student==null)
			throw(illegalargumentexception);
		else
		    Student=nextelementofStudent();
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
