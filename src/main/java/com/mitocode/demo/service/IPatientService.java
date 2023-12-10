package com.mitocode.demo.service;

import com.mitocode.demo.model.Patient;

import java.util.List;

public interface IPatientService {

    Patient save(Patient patient) throws Exception;

    Patient update(Patient patient,Integer id) throws Exception;

    List<Patient> findAll() throws Exception;

    Patient findById(Integer id) throws Exception;

    void delete(Integer id) throws Exception;


}
