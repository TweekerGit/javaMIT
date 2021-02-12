package org.obrii.mit.dp2021.fit;

import java.util.List;

public class Human implements IPeople{

    private String Name;
    private String Phone;
    private String Haircut;

    public Human() {
    }

    public Human(String name, String phone, String haircut) {
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
        return "trap";
    }

    @Override
    public List<IHaircut> getHaircuts() {
        return null;
    }
}
