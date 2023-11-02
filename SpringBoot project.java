package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
package com.example.springdatajpa1;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    @Id
    Long id;
    String firstname;
    String lastname;




}
        import jakarta.transaction.Transactional;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

private static FileOutputStream newFileOutputStream(File f, boolean append)
        throws IOException
        {
        if (append) {
        String path = f.getPath();
        SecurityManager sm = System.getSecurityManager();
        if (sm != null)
        sm.checkWrite(path);
        long handle = openForAtomicAppend(path);
final FileDescriptor fd = new FileDescriptor();
        fdAccess.setHandle(fd, handle);
        return AccessController.doPrivileged(
        new PrivilegedAction<FileOutputStream>() {
    public FileOutputStream run() {
        return new FileOutputStream(fd);
        }
        }
         );
          } else {
          return new FileOutputStream(f);
          }
        }
@Service
public class EmpServ {
    @Autowired
    EmployeeRepository employeeRepository;
    @Transactional
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
}
   import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.stereotype.Service;


public class Run implements CommandLineRunner {
    @Autowired
    EmpServ empServ;
    @Override
    public void run(String... args) throws Exception {
        Employee employee=new Employee();
        employee.setId(4L);
        employee.setFirstname("Fatemeh");
        employee.setLastname("Esmaeily ");
        empServ.save(employee);

    }
}

