package com.isaiasrafael.authservice.business;

import com.isaiasrafael.authservice.infrastructure.entity.Usuario;
import com.isaiasrafael.authservice.infrastructure.exceptions.ConflictExceptions;
import com.isaiasrafael.authservice.infrastructure.exceptions.ResourceNotFoundException;
import com.isaiasrafael.authservice.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario salvaUsuario(Usuario usuario) {
        try {
            emailExiste(usuario.getEmail());
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
            return usuarioRepository.save(usuario);
        } catch (ConflictExceptions e) {
            throw new ConflictExceptions("Email já cadastrado" + e.getCause());
        }
    }

    public void emailExiste(String email) {
        try {
            boolean existe = verificarEmailExistente(email);
            if (existe) {
                throw new ConflictExceptions("Email já cadastrado" + email);
            }
        } catch (ConflictExceptions e) {
            throw new ConflictExceptions("Email já cadastrado" + e.getCause());
        }
    }

    // Mantive separado do metodo acima, pois, pode ser necessário usar o VerificarEmailExistente em outro momento
    public boolean verificarEmailExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public Usuario buscarUsuarioEmail(String email) {
        return (Usuario) usuarioRepository.findByEmail(email).orElseThrow(
                () -> new ResourceNotFoundException("Email não encontrado " + email));

    }

    public void deletaUsuarioEmail (String email) {
        usuarioRepository.deleteByEmail(email);
    }


}
