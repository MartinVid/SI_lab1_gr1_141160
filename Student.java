class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>();
	//TODO constructor
	public Student(String index, String firstName, String lastName, List<int> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage(List <Integer> labPoints) {
		Integer sum = 0;
		if(!labPoints.isEmpty()) {
			for (Integer labPoint : labPoints) {
				sum += labPoint;
			}
			return sum.doubleValue() / labPoints.size();
		}
		return sum;
	}

	public boolean hasSignature(List <Integer> labPoints) {
		return labPoints.size() > 8 ? true : false;
	}
}
