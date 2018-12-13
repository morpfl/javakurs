
public class PostOffice {

	// Deklaration ohne Zuweisung
	private Postman[] employees;

	public PostOffice(Postman[] employees) {
		// hier wird der Array zugewiesen
		this.employees = employees;
	}

	public void printEmployees(){

		// Iteration durch den Array
		for(int i = 0; i < employees.length; i++) {
			if(this.employees = null){
				// ensure that array is not null
				return;
			}
			//ensure that Postman is not null
			if(employees[i] != null){
				System.out.println(employees[i]);
			}
		}
	}
}
