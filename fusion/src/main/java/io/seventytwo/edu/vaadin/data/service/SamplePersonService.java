package io.seventytwo.edu.vaadin.data.service;

import io.seventytwo.edu.vaadin.data.entity.SamplePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;
import com.vaadin.fusion.Nonnull;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Service
public class SamplePersonService extends CrudService<SamplePerson, Integer> {

    private SamplePersonRepository repository;

    public SamplePersonService(@Autowired SamplePersonRepository repository) {
        this.repository = repository;
    }

    @Override
    protected SamplePersonRepository getRepository() {
        return repository;
    }

}
