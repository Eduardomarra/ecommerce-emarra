package com.emarrashop.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emarrashop.ecommerce.builder.FornecedorBuilder;
import com.emarrashop.ecommerce.dto.FornecedorDTO;
import com.emarrashop.ecommerce.entities.Fornecedor;
import com.emarrashop.ecommerce.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired FornecedorRepository fornecedorRepository;
	@Autowired FornecedorBuilder fornecedorBuilder;

	@Transactional(readOnly = true)
	public List<FornecedorDTO> getAllForenecedores() {
		List<Fornecedor> fornecedores = fornecedorRepository.findAll();
		return fornecedores.stream()
				.map(FornecedorDTO::new)
				.toList();
	}

	@Transactional(readOnly = true)
	public FornecedorDTO findById(Long id) {
		Fornecedor fornecedor = fornecedorRepository.findById(id)
				.orElseThrow( () -> new Error("Fornecedor não encontrado."));
		return new FornecedorDTO(fornecedor);
	}

	@Transactional(readOnly = true)
	public List<FornecedorDTO> buscarAtivos() {
		List<Fornecedor> ativos = fornecedorRepository.buscarAtivos();
		return ativos.stream().map(FornecedorDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public List<FornecedorDTO> buscarInativos() {
		List<Fornecedor> inativos = fornecedorRepository.buscarInativos();
		return inativos.stream().map(FornecedorDTO::new).toList();
	}


	@Transactional
	public FornecedorDTO inserirFornecedor(FornecedorDTO dto) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedorBuilder.build(dto, fornecedor);
		fornecedorRepository.save(fornecedor);
		return new FornecedorDTO(fornecedor);
	}

	@Transactional
	public FornecedorDTO atualizarFornecedor(Long id, FornecedorDTO dto) {
		try {
			Fornecedor fornecedor = fornecedorRepository.getReferenceById(id);
			fornecedorBuilder.build(dto, fornecedor);
			fornecedor = fornecedorRepository.save(fornecedor);
			return new FornecedorDTO(fornecedor);
		} catch (Exception e) {
			throw new Error("Fornecedor não encontrado.");
		}
	}
}
