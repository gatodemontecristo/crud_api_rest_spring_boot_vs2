package com.mitocode.demo.repo;

import com.mitocode.demo.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface IMedicRepo extends IGenericRepo<Medico,Integer> {


}
