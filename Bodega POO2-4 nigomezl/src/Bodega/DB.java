package Bodega;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.Reader;
import java.util.List;


public class DB {
    public static void guardar(Set<Camara> productos) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // JSON legible
        try (FileWriter writer = new FileWriter("productos.json")) {
            gson.toJson(productos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static HashSet<Camara> cargar() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader("productos.json")) {
            // Convertir JSON en una lista de objetos Camara
            HashSet<Camara> productos = gson.fromJson(reader, new TypeToken<HashSet<Camara>>() {}.getType());
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            return new HashSet<>();
        }
    }
}