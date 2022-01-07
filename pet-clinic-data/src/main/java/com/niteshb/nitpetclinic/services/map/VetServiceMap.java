package com.niteshb.nitpetclinic.services.map;

import com.niteshb.nitpetclinic.models.Owner;
import com.niteshb.nitpetclinic.models.Vet;
import com.niteshb.nitpetclinic.services.CrudService;
import com.niteshb.nitpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
