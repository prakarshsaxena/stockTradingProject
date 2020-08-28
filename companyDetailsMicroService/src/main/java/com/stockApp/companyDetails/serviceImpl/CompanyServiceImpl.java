package com.stockApp.companyDetails.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.modelmapper.TypeToken;
import java.lang.reflect.Type;

import com.stockApp.companyDetails.dao.CompanyRepo;
import com.stockApp.companyDetails.dtos.CompanyDTO;
import com.stockApp.companyDetails.module.Company;

@Service
@Transactional
public class CompanyServiceImpl {
	@Autowired
	private CompanyRepo companyRepo;
	@Autowired
	private ModelMapper modelMapper;


	public List <CompanyDTO> getAllCompanies() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Type listType = new TypeToken<List<CompanyDTO>>() {
		}.getType();
		return modelMapper.map(companyRepo.findAll(), listType);
	}

	public CompanyDTO createCompany(CompanyDTO companyDTO) {
		String str = UUID.randomUUID().toString();
		companyDTO.setId(str);
		companyRepo.save(modelMapper.map(companyDTO, Company.class));
		return companyDTO;
	}

	public CompanyDTO updateCompany(CompanyDTO companyDTO) {
		companyRepo.save(modelMapper.map(companyDTO, Company.class));
		Optional<Company> optionalCompany = companyRepo.findById(companyDTO.getId());
		Company company = optionalCompany.get();
		return modelMapper.map(company, CompanyDTO.class);
	}

	public CompanyDTO findByTicker(String ticker) {
		Company company = companyRepo.findByTicker(ticker);
		if (company != null) {
			return modelMapper.map(company, CompanyDTO.class);
		}
		return null;
	}

	public CompanyDTO findByName(String name) {
		Company company = companyRepo.findByName(name);
		if (company != null) {
			return modelMapper.map(company, CompanyDTO.class);
		}
		return null;
	}

	public CompanyDTO findById(String id) {
		Optional<Company> optionalCompany = companyRepo.findById(id);
		if (optionalCompany.isPresent()) {
			return modelMapper.map(optionalCompany.get(), CompanyDTO.class);
		}
		return null;
	}

	public List<CompanyDTO> findAllBySector(String sector) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Type listType = new TypeToken<List<CompanyDTO>>() {
		}.getType();
		return modelMapper.map(companyRepo.findAllBySector(sector), listType);
	}


	public List<CompanyDTO> findAllByStockExchangeListContaining(String stockExchange) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Type listType = new TypeToken<List<CompanyDTO>>() {
		}.getType();
		return modelMapper.map(companyRepo.findAllByStockExchangeListContaining(stockExchange), listType);
	}
}
