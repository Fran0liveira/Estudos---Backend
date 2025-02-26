package com.ksoft.estudos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksoft.estudos.models.Usuario;
import com.ksoft.estudos.services.UsuariosService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;
	
	@GetMapping
	public ResponseEntity<?> getUsuarios(){
		
		return ResponseEntity
				.ok(usuariosService.getUsuarios());
	}
	
	@PostMapping
	public ResponseEntity<?> salvarUsuario(@RequestBody Usuario usuario)
	{
		var u = usuariosService.salvarUsuario(usuario);
		return ResponseEntity.ok(u);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletarUsuario(@PathVariable("id") Long id)
	{
		usuariosService.deletarUsuario(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping
	public ResponseEntity<?> editarUsuario(@RequestBody Usuario usuario)
	{
		var u = usuariosService.editarUsuario(usuario);
		return ResponseEntity.ok(u);
	}

}
