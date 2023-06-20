package com.sphere.Asius.Repository;


import com.sphere.Asius.Entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuariosEntity,Integer> {

    public UsuariosEntity findByUsername (String username);

}
