package tasks_grails

class Task {

	String category
	String task
	String requiredBy
	
	Boolean complete = false

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	
	static constraints = {
	}
	
	
}
