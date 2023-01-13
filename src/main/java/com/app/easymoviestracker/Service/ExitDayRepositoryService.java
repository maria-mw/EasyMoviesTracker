package com.app.easymoviestracker.Service;

import com.app.easymoviestracker.Entity.ExitDay;
import com.app.easymoviestracker.Repository.ExitDayRepository;
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
public class ExitDayRepositoryService implements ExitDayRepository {

    @Autowired
    private ExitDayRepository exitDayRepository;

    @Override
    public List<ExitDay> findAll() {
        return exitDayRepository.findAll();
    }

    @Override
    public List<ExitDay> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ExitDay> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ExitDay> findAllById(Iterable<Integer> integers) {
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
    public void delete(ExitDay entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ExitDay> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ExitDay> S save(S entity) {
        return exitDayRepository.save(entity);
    }

    @Override
    public <S extends ExitDay> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ExitDay> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends ExitDay> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ExitDay> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ExitDay getOne(Integer integer) {
        return null;
    }

    @Override
    public ExitDay getById(Integer integer) {
        return null;
    }

    @Override
    public ExitDay getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends ExitDay> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ExitDay> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ExitDay> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ExitDay> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ExitDay> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ExitDay> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ExitDay, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ExitDay> S saveAndFlush(S entity) {
        return null;
    }
}
