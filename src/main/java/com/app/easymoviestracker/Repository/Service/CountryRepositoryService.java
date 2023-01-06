package com.app.easymoviestracker.Repository.Service;

import com.app.easymoviestracker.Entity.Country;
import com.app.easymoviestracker.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CountryRepositoryService implements CountryRepository {

    @Autowired
    private CountryRepository countryRepository;

    @Override   //Save Country
    public <S extends Country> S save(S entity) {
        return countryRepository.save(entity);
    }

    @Override   //Display Countries
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public void flush() {
    }

    @Override
    public <S extends Country> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Country> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Country> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Country getOne(Integer integer) {
        return null;
    }

    @Override
    public Country getById(Integer integer) {
        return null;
    }

    @Override
    public Country getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Country> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Country> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Country> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Country> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Country, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
    @Override
    public <S extends Country> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Country> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }


    @Override
    public List<Country> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Country> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Country entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Country> entities) {

    }

    @Override
    public void deleteAll() {

    }







}
