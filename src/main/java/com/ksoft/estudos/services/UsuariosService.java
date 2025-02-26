package com.ksoft.estudos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ksoft.estudos.models.Usuario;
import com.ksoft.estudos.repository.UsuariosRepository;

@Component
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	public List<Usuario> getUsuarios(){
		
		return usuariosRepository.findAll();
		
	}
	
	public Usuario salvarUsuario(Usuario usuario) {
		System.out.println("usuario: " +usuario.getNome());
		return usuariosRepository.save(usuario);
	}
	
	public void deletarUsuario(Long id) {
		usuariosRepository.deleteById(id);
	}
	
	public Usuario editarUsuario(Usuario usuario) {
		return usuariosRepository.save(usuario);
	}

}
