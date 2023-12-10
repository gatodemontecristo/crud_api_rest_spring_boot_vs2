package com.mitocode.demo.service.impl;

import com.mitocode.demo.model.Patient;
import com.mitocode.demo.repo.IPatientRepo;
import com.mitocode.demo.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService {

    private final IPatientRepo repo;


    @Override
    public Patient save(Patient patient) throws Exception {
        return repo.save(patient);
    }

    @Override
    public Patient update(Patient patient, Integer id) throws Exception {
        patient.setIdPatient(id);
        return repo.save(patient);
    }

    @Override
    public List<Patient> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Patient findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Patient());
    }


    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
