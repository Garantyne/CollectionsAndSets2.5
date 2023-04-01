package exception;

import model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {

    private final Employee employee;

    public EmployeeNotFoundException(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

}
