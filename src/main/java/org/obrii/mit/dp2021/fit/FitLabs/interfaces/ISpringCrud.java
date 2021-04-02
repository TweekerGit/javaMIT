package org.obrii.mit.dp2021.fit.FitLabs.interfaces;

import org.obrii.mit.dp2021.fit.FitLabs.data.Data;
import org.springframework.data.repository.CrudRepository;

public interface ISpringCrud extends CrudRepository<Data, Integer> {
}
