import java.io.*; // Importamos las clases necesarias

public class Mis_notasTxt {
    public static void main(String[] args) {
        // Nombre del archivo de texto que se creará y leerá
        String nombreArchivo = "mis_notas.txt";

        // ==============================
        // ESCRITURA DE ARCHIVO DE TEXTO
        // ==============================
        try {
            // FileWriter permite escribir caracteres en un archivo
            FileWriter archivo = new FileWriter(nombreArchivo);
            
            // PrintWriter facilita la escritura de líneas completas
            PrintWriter escritor = new PrintWriter(archivo);

            // Escribimos tres líneas de notas personales
            escritor.println("Esta semana aprendí a manejar archivos de texto en Java.");
            escritor.println("El uso de FileWriter y BufferedReader es muy útil para leer y escribir.");
            escritor.println("Practicar con ejemplos me ayuda a entender mejor la programación.");

            // Cerramos el archivo para asegurar que los datos se guarden correctamente
            escritor.close();

            System.out.println(" Escritura completada: se creó el archivo " + nombreArchivo);
        } catch (IOException e) {
            // Capturamos cualquier error que pueda ocurrir durante la escritura
            System.out.println(" Error al escribir el archivo: " + e.getMessage());
        }

        // ==============================
        // LECTURA DE ARCHIVO DE TEXTO
        // ==============================
        try {
            // BufferedReader permite leer texto línea por línea
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));

            String linea; // Variable para almacenar cada línea leída

            System.out.println("\n Contenido del archivo:");
            while ((linea = lector.readLine()) != null) {
                // Mostramos cada línea precedida por la palabra "Nota:"
                System.out.println("Nota: " + linea);
            }

            // Cerramos el lector
            lector.close();
        } catch (IOException e) {
            // Capturamos errores en caso de que el archivo no exista o haya problemas al leerlo
            System.out.println("️ Error al leer el archivo: " + e.getMessage());
        }
    }
}
