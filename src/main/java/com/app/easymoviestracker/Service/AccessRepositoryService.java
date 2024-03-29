package com.app.easymoviestracker.Service;

import com.app.easymoviestracker.Entity.Access;
import com.app.easymoviestracker.Repository.AccessRepository;
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
public class AccessRepositoryService implements AccessRepository {

    @Autowired
    private  AccessRepository accessRepository;

    @Override
    public <S extends Access> S save(S entity) {
        return accessRepository.save(entity);
    }

    @Override
    public List<Access> findAll() {
        return accessRepository.findAll();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Access> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Access> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Access> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Access getOne(Integer integer) {
        return null;
    }

    @Override
    public Access getById(Integer integer) {
        return null;
    }

    @Override
    public Access getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Access> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Access> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Access> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Access> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Access> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Access> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Access, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Access> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Access> findById(Integer integer) {
        return Optional.empty();
    }


    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Access> findAllById(Iterable<Integer> integers) {
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
    public void delete(Access entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Access> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override   //Display Accesses
    public List<Access> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Access> findAll(Pageable pageable) {
        return null;
    }









}
