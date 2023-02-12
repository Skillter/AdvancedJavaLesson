package skillter.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {

    // This method should a list containing the same elements as the original,
    // but sorted alphabetically.
    public List<String> sorted(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    // This method should return a list only containing items
    // from the original list that begin with T.
    public List<String> beginningWithT(List<String> list) {
        return list.stream().filter(entry -> entry.startsWith("T")).collect(Collectors.toList());
    }

    // This method should a list containing the same elements as the original,
    // but every String should be all capitalized.
    public List<String> upperCase(List<String> list) {
        return list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
    }

    public List<String> everythingCombined(List<String> weekdays) {
        return sorted(beginningWithT(upperCase(weekdays)));
    }
}
