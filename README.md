Gestión de Proveedores
Este proyecto en Java permite gestionar proveedores, donde se pueden agregar, listar, actualizar y eliminar proveedores desde una base de datos.

Descripción
El sistema de gestión de proveedores es una aplicación simple que interactúa con una base de datos para almacenar y manejar información de proveedores de manera dinámica. Está implementado en Java y utiliza una arquitectura sencilla con las siguientes funcionalidades:

Agregar Proveedor: Permite agregar un nuevo proveedor con su nombre, dirección, teléfono y estado.
Listar Proveedores: Muestra una lista de todos los proveedores almacenados.
Actualizar Proveedor: Modifica los datos de un proveedor existente.
Eliminar Proveedor: Elimina un proveedor de la lista (o en este caso, cambia su estado a inactivo).

Requisitos
Java 8+
NetBeans (o cualquier IDE que soporte Java)
Base de Datos MySQL (o cualquier base de datos compatible con JDBC)

pasos

git clone https://github.com/tu-usuario/gestion-proveedores.git
cd gestion-proveedores

use la base de datos cecistore

Configurar la Conexión a la Base de Datos: Asegúrate de configurar los detalles de conexión en tu clase ProveedorDAO (URL, usuario y contraseña de MySQL).

Ejecutar el Proyecto:

Importa el proyecto en NetBeans o tu IDE favorito.
Ejecuta la clase Main.java.




Uso
El proyecto realiza las siguientes operaciones automáticamente al ejecutarse:

Agregar dos proveedores: El sistema añade dos proveedores ficticios.
Listar proveedores: Muestra todos los proveedores.
Actualizar un proveedor: Modifica los datos del segundo proveedor.
Listar proveedores nuevamente: Muestra los cambios.
Eliminar un proveedor: Elimina el primer proveedor.
Listar proveedores una última vez: Verifica que el primer proveedor ha sido eliminado.

Proveedores después de agregar:
ID: 1
Nombre: Proveedor Ejemplo 1
Direccion: Calle Falsa 123
Telefono: 555-1234
Activo: true
-----
ID: 2
Nombre: Proveedor Ejemplo 2
Direccion: Calle Falsa 456
Telefono: 555-5678
Activo: true
-----
Proveedores después de actualizar el segundo proveedor:
ID: 2
Nombre: Proveedor Actualizado
Direccion: Nueva Direccion 789
Telefono: 555-9876
Activo: true
-----
Proveedores después de eliminar el primer proveedor:
ID: 2
Nombre: Proveedor Actualizado
Direccion: Nueva Direccion 789
Telefono: 555-9876
Activo: true
-----
Autor
Brayhan Steven Vargas
