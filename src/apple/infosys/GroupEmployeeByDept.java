package apple.infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String dept;
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
}

public class GroupEmployeeByDept {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", "HR"));
		employees.add(new Employee("Alice", "Engineering"));
		employees.add(new Employee("Bob", "HR"));
		employees.add(new Employee("Carol", "Engineering"));
		employees.add(new Employee("David", "Finance"));
		employees.add(new Employee("Eve", "Finance"));
		
		Map<String, List<Employee>> listEmpByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
		listEmpByDept.forEach((department, employeeList) -> {
	            System.out.println("Department: " + department);
	            employeeList.forEach(System.out::println);
	            System.out.println();
	        });

	}

}
