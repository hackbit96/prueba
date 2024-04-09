package pe.financieraoh.business.utilahorros.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Util {
    public static String concatenerZeros(String valor) {
        return String.format("%2s", valor)
                .replace(' ', '0');
    }

    public static String getValueByIndexFromDelimitedString(String input, String delimiter, Integer index) {
        List<String> items = Arrays.stream(input.split(delimiter))
                .collect(Collectors.toList());
        return items.get(index);
    }

}
