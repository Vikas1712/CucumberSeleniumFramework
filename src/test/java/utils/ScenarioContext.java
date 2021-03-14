package utils;
import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private static Map<String, String> scenarioContext =new HashMap<>();

    /**
     * This method take two parameters
     * @param key keys as String value
     * @param value value as String
     */
    public static void setContext(String key, String value) {
        scenarioContext.put(key, value);
    }

    /**
     *  This method is used to retrieve the key from scenariosContext
     * @param key  as String value
     * @return String which matches the key
     */
    public static String getContext(String key){
        return String.valueOf(scenarioContext.get(key));
    }

    /**This method performs a check on the complete Map that if it contains the key or not.
     * @param key as String value
     * @return boolean value if it matches the key
     */
    public static Boolean isContains(String key){
        return scenarioContext.containsKey(key.toString());
    }
}
