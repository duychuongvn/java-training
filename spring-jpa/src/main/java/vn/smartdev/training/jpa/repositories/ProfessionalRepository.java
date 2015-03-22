
package vn.smartdev.training.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.smartdev.training.jpa.entites.Professional;


public interface ProfessionalRepository extends JpaRepository<Professional, Integer> {
    
}
