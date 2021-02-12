package org.obrii.mit.dp2021.fit;

import Haircuts.*;

import java.util.ArrayList;
import java.util.List;

public class Male extends Human{

    private String Name;
    private String Phone;
    private String Haircut;

    public Male() {
    }

    public Male(String name, String phone, String haircut) {
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
        return "Male";
    }

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
