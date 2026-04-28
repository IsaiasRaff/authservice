package com.isaiasrafael.authservice.controller;

import com.isaiasrafael.authservice.business.UsuarioService;
import com.isaiasrafael.authservice.controller.dtos.UsuarioDTO;
import com.isaiasrafael.authservice.infrastructure.entity.Usuario;
import com.isaiasrafael.authservice.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @PostMapping
    public ResponseEntity<Usuario> salvaUsuario (@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.salvaUsuario(usuario));
    }

    @PostMapping("/login")
    public String login (@RequestBody UsuarioDTO usuarioDTO) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(usuarioDTO.getEmail(),
                        usuarioDTO.getSenha())
        );
        return "Bearer " + jwtUtil.generateToken(authentication.getName());
    }

    @GetMapping
    public ResponseEntity<Usuario> buscaUsuarioEmail (@RequestParam("email") String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioEmail(email));
    }

    @DeleteMapping ("/{email}")
    public ResponseEntity<Void> deletaUsuarioEmail (@PathVariable String email) {
        usuarioService.deletaUsuarioEmail(email);
        return ResponseEntity.ok().build();
    }


}
