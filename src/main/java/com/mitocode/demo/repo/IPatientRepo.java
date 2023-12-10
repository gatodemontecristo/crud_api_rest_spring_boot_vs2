package com.mitocode.demo.repo;

import com.mitocode.demo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface IPatientRepo extends JpaRepository<Patient,Integer> {


}
