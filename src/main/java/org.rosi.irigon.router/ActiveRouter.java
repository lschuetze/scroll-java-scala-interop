package org.rosi.irigon.router;

public class ActiveRouter extends AbstractRouter {
    public String route(String msg) {
        if(msg == "moep") 
         return "true"; else return "false";
    }
}