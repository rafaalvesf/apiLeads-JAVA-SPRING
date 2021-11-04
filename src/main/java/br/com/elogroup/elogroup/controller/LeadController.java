package br.com.elogroup.elogroup.controller;

import br.com.elogroup.elogroup.dto.LeadDto;
import br.com.elogroup.elogroup.model.LeadModel;
import br.com.elogroup.elogroup.service.LeadService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/leads")
public class LeadController {
    @Autowired
    LeadService leadService;

    @PostMapping
    public ResponseEntity<LeadModel> postLead(@RequestBody @Valid LeadDto leadDto) {
        LeadModel leadModel = new LeadModel();
        BeanUtils.copyProperties(leadDto, leadModel);
        leadService.postLead(leadModel);
        return new ResponseEntity<>(leadModel, HttpStatus.CREATED);
    }
    @GetMapping
    public List<LeadModel> findAll(){
        return leadService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<LeadModel> getModelById(@PathVariable("id") Long id){
        return leadService.getById(id);
    }
    @PutMapping
    public LeadModel update(@RequestBody LeadModel leadModel){
        return leadService.update(leadModel);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<LeadModel> delete(@PathVariable Long id){
        leadService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
