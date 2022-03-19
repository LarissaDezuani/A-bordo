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
public class ContatoController {

 @Autowired
private ContatoRepository contatoRepository;
// get all employees
@GetMapping("/contato")
public List<Contato> getAllContato(){
return contatoRepository.findAll();
}
// create employee rest api
@PostMapping("/contato")
public Contato createContato(@RequestBody Contato contato) {
return contatoRepository.save(contato);
}
// get employee by id rest api
@GetMapping("/contato/{id}")
public ResponseEntity<Contato> getContatoById(@PathVariable Long id) {
Contato contato = contatoRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
return ResponseEntity.ok(contato);
}
// update employee rest api
@PutMapping("/contato/{id}")
public ResponseEntity<Contato> updateContato(@PathVariable Long id, @RequestBody Contato contatoDetails){
Contato contato = contatoRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("contato not exist with id :" + id));
contato.setMensagem(contatoDetails.getMensagem());
contato.setNome(contatoDetails.getNome());
contato.setEmail(contatoDetails.getEmail());
Contato updatedContato = contatoRepository.save(contato);
return ResponseEntity.ok(updatedContato);
}
// delete employee rest api
@DeleteMapping("/contato/{id}")
public ResponseEntity<Map<String, Boolean>> deleteContato(@PathVariable Long id){
Contato contato = contatoRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Contato not exist with id :" + id));
contatoRepository.delete(contato);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return ResponseEntity.ok(response);
}
}


