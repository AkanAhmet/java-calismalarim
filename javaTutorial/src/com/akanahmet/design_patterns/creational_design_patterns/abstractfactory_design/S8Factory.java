package com.akanahmet.design_patterns.creational_design_patterns.abstractfactory_design;



public class S8Factory implements ITelefonFactory {
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new S8(model,batarya,en,boy);


}}