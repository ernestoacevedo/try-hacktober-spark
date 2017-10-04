package hack.tober.fest;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;

/**
 * Created by Camilo on 10/03/2017.
 */
public class Thing {

    public static void main(String[] args) {

        Spark.staticFileLocation("/public");

        get("/simpleget", (req, res) -> "Simple get");

        get("/", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "For Hacktober!");
            return new FreeMarkerEngine().render(new ModelAndView(attributes, "index.ftl"));
        });

    }

}
