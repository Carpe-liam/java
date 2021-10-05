package com.alex.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alex.models.Language;
import com.alex.repositories.LanguageRepository;

@Service
public class LanguageService {
	
// language repository dependency
	private final LanguageRepository langRepo;
	
// constructor
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
// return all languages
	public ArrayList<Language> allLanguages(){
		return langRepo.findAll();
	}

// create languages
	public Language createLanguage(Language language) {
		return langRepo.save(language);
	}
	
	
// get lang by id
	public Language findLanguage(Long id) {
		Optional<Language> optLang = langRepo.findById(id);
		if(optLang.isPresent()) {
			return optLang.get();
		} else {
			return null;
		}
	}
	
// update language
	public Language updateLanguage(Long id, String name, String creator, double version) {
		Language editLang = langRepo.getById(id);
		editLang.setName(name);
		editLang.setCreator(creator);
		editLang.setVersion(version);
		return langRepo.save(editLang);
	}

// delete language
	public void deleteLang(Long id) {
		langRepo.deleteById(id);
	}
	
	
	
	
}
