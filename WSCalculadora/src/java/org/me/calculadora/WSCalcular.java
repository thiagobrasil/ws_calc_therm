/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author thiagobrasil
 */
@WebService(serviceName = "WSCalcular")
@Stateless()
public class WSCalcular {


    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int r = a + b;
        return r;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "subtrair")
    public int subtrair(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int r = a - b;
        return r;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int r = a * b;
        return r;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "dividir")
    public float dividir(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        float r = a / b;
        return r;
    }


}
