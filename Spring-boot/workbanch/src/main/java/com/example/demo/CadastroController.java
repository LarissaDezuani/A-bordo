package com.example.demo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CadastroController {

 @Autowired
private CadastroRepository cadastroRepository;
// get all employees
@GetMapping("/cadastro")
public List<Cadastro> getAllCadastro(){
return cadastroRepository.findAll();
}
// create employee rest api
@PostMapping("/cadastro")
public Cadastro cadastroRepository(@RequestBody Cadastro cadastro) {
return cadastroRepository.save(cadastro);
}
// get employee by id rest api
@GetMapping("/cadastro/{id}")
public ResponseEntity<Cadastro> getContatoById(@PathVariable Long id) {
Cadastro cadastro = cadastroRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("cadastro not exist with id :" + id));
return ResponseEntity.ok(cadastro);
}
// update employee rest api
@PutMapping("/cadastro/{id}")
public ResponseEntity<Cadastro> updateCadastro(@PathVariable Long id, @RequestBody Cadastro cadastroDetails){
Cadastro cadastro = cadastroRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("cadastro not exist with id :" + id));
cadastro.setNome(cadastroDetails.getNome());
cadastro.setNascimento(cadastroDetails.getNascimento());
cadastro.setCpf(cadastroDetails.getCpf());
Cadastro updatedCadastro = cadastroRepository.save(cadastro);
return ResponseEntity.ok(updatedCadastro);
}
// delete employee rest api
@DeleteMapping("/cadastro/{id}")
public ResponseEntity<Map<String, Boolean>> deleteCadastro(@PathVariable Long id){
Cadastro cadastro = cadastroRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("cadastro not exist with id :" + id));
cadastroRepository.delete(cadastro);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return ResponseEntity.ok(response);
}
}


