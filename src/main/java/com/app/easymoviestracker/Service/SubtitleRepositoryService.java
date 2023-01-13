package com.app.easymoviestracker.Service;

import com.app.easymoviestracker.Entity.Subtitle;
import com.app.easymoviestracker.Repository.SubtitleRepository;
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
public class SubtitleRepositoryService implements SubtitleRepository {

    @Autowired
    private SubtitleRepository subtitleRepository;

    @Override
    public List<Subtitle> findAll() {
        return subtitleRepository.findAll();
    }

    @Override
    public List<Subtitle> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Subtitle> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Subtitle> findAllById(Iterable<Integer> integers) {
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
    public void delete(Subtitle entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Subtitle> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Subtitle> S save(S entity) {
        return subtitleRepository.save(entity);
    }

    @Override
    public <S extends Subtitle> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Subtitle> findById(Integer integer) {
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
    public <S extends Subtitle> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Subtitle> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Subtitle> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Subtitle getOne(Integer integer) {
        return null;
    }

    @Override
    public Subtitle getById(Integer integer) {
        return null;
    }

    @Override
    public Subtitle getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Subtitle> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Subtitle> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Subtitle> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Subtitle> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Subtitle> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Subtitle> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Subtitle, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
