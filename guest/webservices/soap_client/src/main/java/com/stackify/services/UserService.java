
package com.stackify.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://services.stackify.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://services.stackify.com/UserService/addUserRequest", output = "http://services.stackify.com/UserService/addUserResponse")
    public void addUser(
        @WebParam(name = "arg0", partName = "arg0")
        User arg0);

    /**
     * 
     * @return
     *     returns com.stackify.services.Users
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://services.stackify.com/UserService/getUsersRequest", output = "http://services.stackify.com/UserService/getUsersResponse")
    public Users getUsers();

}
