package Leticia.projetojpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Leticia.projetojpa.entities.Produto;
import Leticia.projetojpa.service.ProdutoService;

@RestController
@RequestMapping("/products")

public class ProjetoController {
 private final ProdutoService produtoService;
 
 public ProjetoController(ProdutoService produtoService) {
	 this.produtoService = produtoService;
	 
 }
 
 @PostMapping
 public Produto createProduct (@RequestBody Produto produto) {
	 return produtoService.saveProduto(produto);
	 
 }
  @GetMapping("/{id}")
  public Produto getProduto(@PathVariable Long id) {
	return produtoService.getProdutoById(id);
	
}
   @GetMapping
   public List<Produto> getAllProdutos() {
	   return produtoService.getAllProdutos();
	   
   }
   
   @DeleteMapping("{id}")
    public void deleteProduto(@PathVariable Long id) {
	   produtoService.deleteProduto(id);
	   
   }
   
}