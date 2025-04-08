package lesson6.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonWriter {
    private static final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static <T> void writeToJson(String fileName, List<T> dataList) {
        try {
            mapper.writeValue(new File(fileName), dataList);
        } catch (IOException e) {
            System.err.println("Yazma zamanı xəta: " + e.getMessage());
        }
    }
}
