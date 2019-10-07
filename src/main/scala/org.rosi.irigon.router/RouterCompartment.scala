package org.rosi.irigon.router;

import scroll.internal._
import scroll.internal.support.DispatchQuery
import DispatchQuery._

class RouterCompartment extends Compartment {

    class AlgorithmARouter {
        def route(msg : String) : String = {
            msg match {
                case "narf" => "true";
                case "moep" => "false";
            }
        }
    }

    def adapt(router : AbstractRouter) : Player[AbstractRouter] = {
        router play new AlgorithmARouter
    }

    def route(router : Player[AbstractRouter], msg : String) : String = {
        router route msg
    }
}