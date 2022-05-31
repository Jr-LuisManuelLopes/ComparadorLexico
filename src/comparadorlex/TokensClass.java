/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadorlex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokensClass {
    
    boolean tokensLetras(String valor){
        Pattern tipoFuncion = Pattern.compile("([a-zA-Z]\\w+)|([a-zA-Z])");
        Matcher buscar = tipoFuncion.matcher(valor);
          return buscar.matches();
    }
    
    boolean tokenSEspecificos(String valor){
        Pattern tipoFuncion = Pattern.compile("\\(|\\)|,|;|'|´|CREATE TABLE|PRIMARY KEY|AUTO_INCREMENT|FOREING KEY|NULL|NOT NULL");
        Matcher buscar = tipoFuncion.matcher(valor);
          return buscar.matches();
    }
     boolean tokensTipo(String valor){
        Pattern tipoFuncion = Pattern.compile("bigint|binary|bit|blob|bool|boolean|char|character|date|"
                + "datetime|dec|decimal|double|enum|geometry|int|integer|json|linestring|"
                + "long|longblob|mediumblob|mediumint|text|time");
        Matcher buscar = tipoFuncion.matcher(valor);
          return buscar.matches();
    }
    
}
