package hack.tober.fest;

import java.util.HashMap;
import java.util.Map;

import hack.tober.fest.search.Search;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

/**
 * Created by Camilo on 10/03/2017.
 */
public class Thing {

    public static void main(String[] args) {

        Spark.staticFileLocation("/public");
        Search searchOn = new Search().getSingletonInstance();

        get("/posts", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("popularpost", searchOn.getSomeEntries());
            return new FreeMarkerEngine().render(new ModelAndView(attributes, "posts.ftl"));
        });

        get("/", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "For Hacktober!");
            return new FreeMarkerEngine().render(new ModelAndView(attributes, "index.ftl"));
        });

    }

}
