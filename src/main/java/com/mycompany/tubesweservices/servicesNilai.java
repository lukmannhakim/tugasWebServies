/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tubesweservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author lukman
 */
@WebService(serviceName = "servicesNilai")
@Stateless()
public class servicesNilai {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tambah")
    public int tambah(@WebParam(name = "angka1") int angka1, @WebParam(name = "angka2") int angka2) {
        //TODO write your implementation code here:
        return 0;
    }
}
