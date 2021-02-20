package org.obrii.mit.dp2021.fit;

import Haircuts.*;

import java.util.ArrayList;
import java.util.List;

public class MaleHaircutsService implements IHaircutsService{

    @Override
    public List<IHaircut> getHaircuts() {
        List<IHaircut> haircuts= new ArrayList<>();

        haircuts.add(new MaleBald());
        haircuts.add(new MaleCock());
        haircuts.add(new MaleGorshok());
        haircuts.add(new MaleGrunge());
        haircuts.add(new MaleIrakez());

        return haircuts;
    }
}
