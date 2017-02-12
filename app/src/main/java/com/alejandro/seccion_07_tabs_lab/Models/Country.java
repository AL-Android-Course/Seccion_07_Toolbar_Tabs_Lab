package com.alejandro.seccion_07_tabs_lab.Models;

import java.text.MessageFormat;

/**
 * Created by Alejandro on 11/2/17.
 */

public class Country {

    private String Name;
    private String CountryCode;


    public Country(String name, String countryCode) {
        Name = name;
        CountryCode = countryCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }


    public String getFlagURL() {
        return MessageFormat.format("http://www.geognos.com/api/en/countries/flag/{0}.png",
                this.getCountryCode());
    }

    // Importante!! Sobreescribimos el método toString de nuestra clase POJO Country
    // Para que cuando el Spinner llame internamente cada objeto, use el name para ser mostrado
    // como único valor posible en la lista desplegable
    @Override
    public String toString() {
        return Name;
    }


}
