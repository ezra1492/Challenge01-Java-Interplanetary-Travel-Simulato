import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static String[] planetas = {
        "Mercurio", "Venus", "Marte", "Júpiter", 
        "Saturno", "Urano", "Neptuno", "Plutón", "Ceres", 
        "Eris", "Haumea", "Makemake"
    };
   
    static String[] descripcionPlaneta = {
        "Cocinándose a temperaturas extremas.", "Está densa la atmósfera.", 
        "De aquí vienen los comunistas (el planeta rojo).", 
        "Tormentas, gases y vientos de más de 500 Km/h.", 
        "El señor de los anillos, y lunas.", "Un gigante de hielo.",
        "Sopla, sopla, sopla\nlos vientos más veloces del sistema solar.", 
        "Enano, de órbita única y elíptica", "El pequeñito del cinturón de asteroides.",
        "Enano al borde del sistema.", "Rotación rápida, elíptico y enano.", 
        "El último enano de hielo."
    };
    
    static double[] distancias = {
        77.0, 41.0, 628.0, 1275.0, 2723.0, 4351.0, 5906.0, 5910.0, 413.0, 
        10100.0, 13000.0, 6700.0
    };

    static int planetaSeleccionado = -1;

    // Seleccionar un planeta
    public static void seleccionarPlaneta() {
        System.out.println("\nSelecciona un planeta:");
        for (int i = 0; i < planetas.length; i++) {
            // Imprime el planeta junto con su distancia
            System.out.println((i + 1) + ". " + planetas[i] + " (Distancia: " + distancias[i] + " millones de km.)");            
        }
        System.out.print("Selecciona el número del planeta: ");
        planetaSeleccionado = scanner.nextInt() - 1;
        if (planetaSeleccionado >= 0 && planetaSeleccionado < planetas.length) {
            System.out.println("Has seleccionado: " + planetas[planetaSeleccionado]);
            System.out.println(descripcionPlaneta[planetaSeleccionado]);
        } else {
            System.out.println("Selección no válida.");
        }
    }    
}    