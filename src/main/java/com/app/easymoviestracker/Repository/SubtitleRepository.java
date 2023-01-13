package com.app.easymoviestracker.Repository;

import com.app.easymoviestracker.Entity.Subtitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtitleRepository extends JpaRepository<Subtitle, Integer> {
}
