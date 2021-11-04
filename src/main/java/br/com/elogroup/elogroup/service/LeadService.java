package br.com.elogroup.elogroup.service;

import br.com.elogroup.elogroup.model.LeadModel;
import br.com.elogroup.elogroup.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class LeadService {
    @Autowired
    LeadRepository leadRepository;

    public LeadModel postLead(@Valid @RequestBody LeadModel leadModel){
        return leadRepository.save(leadModel);
    }

    public List<LeadModel> findAll(){
        return leadRepository.findAll();
    }
    public Optional<LeadModel> getById(Long id){
        return leadRepository.findById(id);
    }
    public LeadModel update(LeadModel leadModel){
        return leadRepository.save(leadModel);
    }
    public void delete(Long id){
        leadRepository.deleteById(id);
    }
}
