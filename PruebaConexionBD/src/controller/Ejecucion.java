/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Estudiantes;

/**
 *
 * @author usuario
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.setNombre("Dujardin");
        estudiante1.setApellido(2);
        estudiante1.setCodigo(0);

        EntityManager em = Persistence.createEntityManagerFactory("PruebaConexionBDPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(estudiante1);
        em.getTransaction().commit();
        
    }
    
}
