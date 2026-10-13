public class Main {
    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        s1.setNombre("API Pedidos");
        s1.setPuerto(8080);

        // Detenido: no cuenta la petición
        s1.registrarPeticion();
        System.out.println("Peticiones con servicio detenido: " + s1.getCantidadPeticiones());

        s1.iniciar();
        s1.registrarPeticion();
        s1.registrarPeticion();
        s1.registrarPeticion();

        System.out.println("Servicio: " + s1.getNombre());
        System.out.println("Puerto: " + s1.getPuerto());
        System.out.println("Activo: " + s1.isActivo());
        System.out.println("Peticiones: " + s1.getCantidadPeticiones());

        // Datos incorrectos
        s1.setPuerto(-1);
        s1.setNombre("");
        s1.setCantidadPeticiones(-10);
        System.out.println("datos incorrectos ");
        System.out.println("Nombre: " + s1.getNombre());
        System.out.println("Puerto: " + s1.getPuerto());
        System.out.println("Peticiones: " + s1.getCantidadPeticiones());

        s1.detener();
        System.out.println("Activo después de detener(): " + s1.isActivo());
    }
}

