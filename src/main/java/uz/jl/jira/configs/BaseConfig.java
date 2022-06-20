package uz.jl.jira.configs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/16:29 (Tuesday)
 * jira/IntelliJ IDEA
 */
public class BaseConfig {
    private static Gson gson;

    public static Gson getGson() {
        if(gson == null){
            gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .setDateFormat("yyyy-MM-dd  HH:mm:ss")
                    .create();
        }
        return gson;
    }
}
