package com.sphere.Asius.Services;


import com.sphere.Asius.Entity.UsuarioRolEntity;
import com.sphere.Asius.Entity.UsuariosEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UsuarioServices {

    public UsuariosEntity guardarUsuarioService (UsuariosEntity usuariosEntity, Set<UsuarioRolEntity> usuarioRolEntity) throws Exception;

    public UsuariosEntity obtenerUsuarioService (String username);

    public void eliminarUsuarioService (int idusurios);

}
