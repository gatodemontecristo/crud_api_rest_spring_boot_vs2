package com.mitocode.demo.service.impl;

import com.mitocode.demo.model.Medico;
import com.mitocode.demo.repo.IGenericRepo;
import com.mitocode.demo.repo.IMedicRepo;
import com.mitocode.demo.service.IMedicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicServiceImpl extends CRUDImpl<Medico,Integer>  implements IMedicService {

    private final IMedicRepo repo;


    @Override
    protected IGenericRepo<Medico, Integer> getRepo() {
        return repo;
    }
}
