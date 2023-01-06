package com.app.easymoviestracker.Repository.Service;

import com.app.easymoviestracker.Entity.Language;
import com.app.easymoviestracker.Repository.LanguageRepository;
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
public class LanguageRepositoryService implements LanguageRepository {
    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public <S extends Language> S save(S entity) {
        return languageRepository.save(entity);
    }

    @Override
    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    @Override
    public List<Language> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Language> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Language> findAllById(Iterable<Integer> integers) {
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
    public void delete(Language entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Language> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Language> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Language> findById(Integer integer) {
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
    public <S extends Language> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Language> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Language> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Language getOne(Integer integer) {
        return null;
    }

    @Override
    public Language getById(Integer integer) {
        return null;
    }

    @Override
    public Language getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Language> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Language> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Language> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Language> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Language> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Language> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Language, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
