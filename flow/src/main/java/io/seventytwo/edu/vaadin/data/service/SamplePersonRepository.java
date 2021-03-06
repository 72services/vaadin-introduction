package io.seventytwo.edu.vaadin.data.service;

import io.seventytwo.edu.vaadin.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}