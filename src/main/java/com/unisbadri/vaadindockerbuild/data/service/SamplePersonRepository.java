package com.unisbadri.vaadindockerbuild.data.service;

import com.unisbadri.vaadindockerbuild.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}