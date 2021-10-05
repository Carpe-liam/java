package com.alex.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.alex.models.Language;

@Service
public interface LanguageRepository extends CrudRepository<Language, Long>{

// get all languages
	ArrayList<Language> findAll();
// get by ID
	Language getById(Long id);
// delete language
	void deleteById(Long id);
}
