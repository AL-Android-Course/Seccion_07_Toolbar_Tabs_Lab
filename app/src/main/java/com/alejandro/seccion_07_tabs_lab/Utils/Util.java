package com.alejandro.seccion_07_tabs_lab.Utils;

import com.alejandro.seccion_07_tabs_lab.Models.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandro on 11/2/17.
 */

public class Util {

    public static List<Country> getCountries() {
        return new ArrayList<Country>() {{
            add(new Country("España", "ES"));
            add(new Country("Argentina", "AR"));
            add(new Country("Bolivia", "BO"));
            add(new Country("Chile", "CL"));
            add(new Country("Colombia", "CO"));
            add(new Country("Ecuador", "EC"));
            add(new Country("Mexico", "MX"));
            add(new Country("Perú", "PE"));
            add(new Country("Uruguay", "UY"));
            add(new Country("Venezuela", "VE"));
        }};
    }
}
