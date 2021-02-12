package org.obrii.mit.dp2021.fit;

import Haircuts.*;

import java.util.ArrayList;
import java.util.List;

public class Female extends Human{

    private String Name;
    private String Phone;
    private String Haircut;

    public Female() {
    }

    public Female(String name, String phone, String haircut) {
        Name = name;
        Phone = phone;
        Haircut = haircut;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getHaircut() {
        return Haircut;
    }

    @Override
    public String getSex() {
        return "Female";
    }

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
