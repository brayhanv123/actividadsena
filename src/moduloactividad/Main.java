package moduloactividad;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProveedorDAO proveedorDAO = new ProveedorDAO();

        // Crear y agregar dos proveedores de ejemplo
        Proveedor proveedor1 = new Proveedor(1, "Proveedor Ejemplo 1", "Calle Falsa 123", "555-1234", true);
        Proveedor proveedor2 = new Proveedor(2, "Proveedor Ejemplo 2", "Calle Falsa 456", "555-5678", true);
        proveedorDAO.agregarProveedor(proveedor1);
        proveedorDAO.agregarProveedor(proveedor2);

        // Listar proveedores después de la creación
        System.out.println("Proveedores después de agregar:");
        listarProveedores(proveedorDAO.listarProveedores());

        // Actualizar el segundo proveedor
        Proveedor proveedorActualizado = new Proveedor(2, "Proveedor Actualizado", "Nueva Direccion 789", "555-9876", true);
        proveedorDAO.actualizarProveedor(proveedorActualizado);

        // Listar proveedores después de la actualización
        System.out.println("Proveedores después de actualizar el segundo proveedor:");
        listarProveedores(proveedorDAO.listarProveedores());

        // Eliminar el primer proveedor
        proveedorDAO.eliminarProveedor(1);

        // Listar proveedores después de la eliminación
        System.out.println("Proveedores después de eliminar el primer proveedor:");
        listarProveedores(proveedorDAO.listarProveedores());
    }

    // Método auxiliar para listar los proveedores
    private static void listarProveedores(List<Proveedor> proveedores) {
        for (Proveedor proveedor : proveedores) {
            System.out.println("ID: " + proveedor.getId());
            System.out.println("Nombre: " + proveedor.getNombre());
            System.out.println("Direccion: " + proveedor.getDireccion());
            System.out.println("Telefono: " + proveedor.getTelefono());
            System.out.println("Activo: " + proveedor.isStatus());
            System.out.println("-----");
        }
    }
}
