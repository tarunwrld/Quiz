package com.thinkai.quiz.Repository;

import com.thinkai.quiz.Entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Model, Long> {
}
