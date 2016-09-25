/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.conversor;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author thiagobrasil
 */
@WebService(serviceName = "WSConversor")
@Stateless()
public class WSConversor {


    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "FahrenheitToCelcius")
    public float Fahrenheit(@WebParam(name = "a") float a) {
        //TODO write your implementation code here:
        float f2c = ((a - 32) * 5 / 9);
        return f2c;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "CelciusToFahrenheit")
    public float Celcius(@WebParam(name = "a") float a) {
        //TODO write your implementation code here:
        float c2f = ((a * 9/5) + 32);
        return c2f;
    }
}
