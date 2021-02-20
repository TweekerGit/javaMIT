package org.obrii.mit.dp2021.fit;

import Haircuts.*;

import java.util.ArrayList;
import java.util.List;

public class FemaleHaircutsService implements IHaircutsService{
    @Override
    public List<IHaircut> getHaircuts() {
        List<IHaircut> haircuts= new ArrayList<>();

        haircuts.add(new FemaleAfro());
        haircuts.add(new FemaleCesson());
        haircuts.add(new FemaleKare());
        haircuts.add(new FemaleLong());
        haircuts.add(new FemaleWolf());

        return haircuts;
    }
}
