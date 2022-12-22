package com.ryzhov_andrey.crud.service.impl;

import com.ryzhov_andrey.crud.model.Developer;
import com.ryzhov_andrey.crud.repository.DeveloperRepository;
import com.ryzhov_andrey.crud.repository.jdbc.JdbcDeveloperRepositoryImpl;
import com.ryzhov_andrey.crud.service.DeveloperService;

import java.util.List;

public class DeveloperServiceImpl implements DeveloperService {
    private final DeveloperRepository developerRepository;

    public DeveloperServiceImpl() {
        this.developerRepository = new JdbcDeveloperRepositoryImpl();
    }

    @Override
    public Developer getById(Long id) {
        return developerRepository.getById(id);
    }

    @Override
    public List<Developer> getAll() {
        return developerRepository.getAll();
    }

    @Override
    public Developer create(Developer developer) {
        return developerRepository.create(developer);
    }

    @Override
    public Developer update(Developer developer) {
        return developerRepository.update(developer);
    }

    @Override
    public void deleteById(Long id) {
        developerRepository.deleteById(id);
    }
}