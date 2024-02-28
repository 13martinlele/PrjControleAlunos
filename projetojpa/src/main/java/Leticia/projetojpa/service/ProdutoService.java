package Leticia.projetojpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Leticia.projetojpa.entities.Produto;
import Leticia.projetojpa.repository.ProdutoRepository;

@Service
public class ProdutoService {
	private final ProdutoRepository produtoRepository;

	
	privateProdutoService  ProdutoRepository (PrdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto saveProduto (Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	
	}
	
	public List<Produto> getAllProdutos() {
		return produtoRepository.findAll();
	}
	
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}
