package com.app.easymoviestracker.Service;

import com.app.easymoviestracker.Entity.Genre;
import com.app.easymoviestracker.Repository.GenreRepository;
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
public class GenreRepositoryService implements GenreRepository {

    @Autowired
    private GenreRepository genreRepository;

    @Override   //Save genre
    public <S extends Genre> S save(S entity) {
        return genreRepository.save(entity);
    }

    @Override   //Display Genres
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @Override
    public void flush() {
    }

    @Override
    public <S extends Genre> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Genre> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Genre> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Genre getOne(Integer integer) {
        return null;
    }

    @Override
    public Genre getById(Integer integer) {
        return null;
    }

    @Override
    public Genre getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Genre> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Genre> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Genre> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Genre> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Genre> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Genre> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Genre, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Genre> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Genre> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Genre> findAllById(Iterable<Integer> integers) {
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
    public void delete(Genre entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
    }

    @Override
    public void deleteAll(Iterable<? extends Genre> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<Genre> findAll(Sort sort) {
        return genreRepository.findAll();
    }

    @Override
    public Page<Genre> findAll(Pageable pageable) {
        return null;
    }
}
