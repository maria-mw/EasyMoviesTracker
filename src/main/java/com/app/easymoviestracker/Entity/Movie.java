package com.app.easymoviestracker.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "Movie")
public class Movie implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String titleEng;
    private String titleRus;
    private Integer year;
    private Integer seasons;
    private Integer releasedSeries;
    private Integer watchedSeries;
    private String comments;

    @ManyToOne
    private Status status;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Access access;
    @ManyToOne
    private Country country;
    @ManyToOne
    private ExitDay exitDay;
    @ManyToOne
    private Genre genre;
    @ManyToOne
    private Language language;
    @ManyToOne
    private Subtitle subtitle;

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public void setTitleEng(String titleEng) {
        this.titleEng = titleEng;
    }

    public String getTitleRus() {
        return titleRus;
    }

    public void setTitleRus(String titleRus) {
        this.titleRus = titleRus;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Integer getReleasedSeries() {
        return releasedSeries;
    }

    public void setReleasedSeries(Integer releasedSeries) {
        this.releasedSeries = releasedSeries;
    }

    public Integer getWatchedSeries() {
        return watchedSeries;
    }

    public void setWatchedSeries(Integer watchedSeries) {
        this.watchedSeries = watchedSeries;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ExitDay getExitDay() {
        return exitDay;
    }

    public void setExitDay(ExitDay exitDay) {
        this.exitDay = exitDay;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", titleEng='" + titleEng + '\'' +
                ", titleRus='" + titleRus + '\'' +
                ", year=" + year +
                ", seasons=" + seasons +
                ", releasedSeries=" + releasedSeries +
                ", watchedSeries=" + watchedSeries +
                ", comments='" + comments + '\'' +
                '}';
    }
}
