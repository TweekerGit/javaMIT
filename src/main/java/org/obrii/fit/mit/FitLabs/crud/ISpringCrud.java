/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.fit.mit.FitLabs.crud;

import org.obrii.fit.mit.FitLabs.Data.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringCrud extends CrudRepository<Data, Long>{

   
    
}
