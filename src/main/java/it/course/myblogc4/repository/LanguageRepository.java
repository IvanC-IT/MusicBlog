package it.course.myblogc4.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.course.myblogc4.entity.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, String>{

}
