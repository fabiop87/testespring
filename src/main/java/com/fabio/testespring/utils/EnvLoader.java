package com.fabio.testespring.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class EnvLoader {
    public static void loadEnv(String filePath) {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines
                    .filter(line -> line.contains("=") && !line.trim().startsWith("#")) // Ignora comentários e linhas inválidas
                    .forEach(line -> {
                        String[] parts = line.split("=", 2);
                        String key = parts[0].trim();
                        String value = parts[1].trim();
                        System.setProperty(key, value); // Define como variável do sistema
                    });
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar o arquivo .env", e);
        }
    }
}
