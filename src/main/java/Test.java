import org.rosi.irigon.router.AbstractRouter;
import org.rosi.irigon.router.ActiveRouter;

import org.rosi.irigon.router.RouterCompartment;
import scroll.internal.Compartment;
import scroll.internal.Compartment.Player;

public class Test {
    public static void main(String[] args) {
        AbstractRouter router = new ActiveRouter();
        System.out.println(router.route("moep"));
        System.out.println(router.route("narf"));

        RouterCompartment routerCompartment = new RouterCompartment();
        Player<AbstractRouter> adaptedRouter = routerCompartment.adapt(router);
        System.out.println(routerCompartment.route(adaptedRouter, "moep"));
        System.out.println(routerCompartment.route(adaptedRouter, "narf"));
    }

}