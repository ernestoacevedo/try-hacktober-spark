package hack.tober.fest;

import static spark.Spark.*;
import static spark.Spark.options;

/**
 * Created by Camilo on 10/03/2017.
 */
public class Thing {

    public static void main(String[] args) {

        get("/simpleget", (req, res) -> "Hello World");

        get("/", (request, response) ->  "Welcome to first page in spark" );

        post("/", (request, response) ->  "" );

        put("/", (request, response) -> "" );

        delete("/", (request, response) -> "" );

        options("/", (request, response) -> "" );

    }

}
