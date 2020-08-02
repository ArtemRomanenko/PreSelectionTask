package recipe;

import java.io.FileOutputStream;
import java.io.IOException;

public class RecipeSaver {
    public void recipeStorage(String recipe) {

        try (FileOutputStream fos = new FileOutputStream("/Users/macbook/Java_Projects/notes.txt")) {
            byte[] buffer = recipe.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
