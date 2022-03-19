
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
public class DestinoController {

 @Autowired
private DestinoRepository destinoRepository;
// get all employees
@GetMapping("/destino")
public List<Destino> getAllDestino(){
return destinoRepository.findAll();
}
// create employee rest api
@PostMapping("/destino")
public Destino destinoRepository(@RequestBody Destino destino) {
return destinoRepository.save(destino);
}
// get employee by id rest api
@GetMapping("/destino/{id}")
public ResponseEntity<Destino> getDestinoById(@PathVariable Long id) {
	Destino destino = destinoRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Destino not exist with id :" + id));
return ResponseEntity.ok(destino);
}
// update employee rest api
@PutMapping("/destino/{id}")
public ResponseEntity<Destino> updateDestino(@PathVariable Long id, @RequestBody Destino destinoDetails){
Destino destino = destinoRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Destino not exist with id :" + id));
destino.setLocalSaidaDestino(destinoDetails.getLocalSaidaDestino());
destino.setLocalDestino(destinoDetails.getLocalDestino());
destino.setHoraDestino(destinoDetails.getHoraDestino());
destino.setDataDestino(destinoDetails.getDataDestino());

Destino updatedDestino = destinoRepository.save(destino);
return ResponseEntity.ok(updatedDestino);
}
// delete employee rest api
@DeleteMapping("/destino/{id}")
public ResponseEntity<Map<String, Boolean>> deleteDestino(@PathVariable Long id){
	Destino destino = destinoRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("destino not exist with id :" + id));
destinoRepository.delete(destino);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return ResponseEntity.ok(response);
}
}


