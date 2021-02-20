package org.obrii.mit.dp2021.fit;

public class Female extends Human{

    public Female() {
        super(new FemaleHaircutsService());
    }

    public Female(String name, String phone, String haircut){
        super(name, phone, haircut, new FemaleHaircutsService());
    }

    @Override
    public String getSex() {
        return "Female";
    }
}
