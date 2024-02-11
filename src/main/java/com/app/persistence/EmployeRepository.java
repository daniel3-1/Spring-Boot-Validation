package com.app.persistence;

import com.app.entities.Employe;
import jdk.jfr.Registered;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long>{
}
