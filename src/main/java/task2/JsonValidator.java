package task2;

import java.util.*;

public class JsonValidator {

    public static boolean isValidJson(Object input) {
        if (input == null) {
            return true;
        }

        if (input instanceof Map) {
            final Map<?, ?> map = (Map<?, ?>) input;

            for (Map.Entry<?, ?> entry : map.entrySet()) {
                final Object key = entry.getKey();
                final Object value = entry.getValue();

                if (!(key instanceof String)) {
                    return false;
                }

                if (!isValidJson(value)) {
                    return false;
                }
            }
            return true;
        }

        if (input instanceof List<?>) {
            final List<?> list = (List<?>) input;

            for (Object element : list) {
                if (!isValidJson(element)) {
                    return false;
                }
            }
            return true;
        }

        if (input instanceof String ||
                input instanceof Number ||
                input instanceof Boolean) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        final Map<String, Object> validJson = Map.of(
                "user", Map.of(
                        "name", "A",
                        "age", 30
                )
        );
        System.out.println("Test 1 (Valid): " + isValidJson(validJson));
    }
}
