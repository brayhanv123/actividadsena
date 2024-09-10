/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloactividad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darkh
 */
public class ProveedorDAO {

    public List<Proveedor> listarProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT * FROM tb_Proveedor";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Proveedor proveedor = new Proveedor(
                    rs.getInt("id_prov"),
                    rs.getString("nombre_prov"),
                    rs.getString("direccion_prov"),
                    rs.getString("telefono_prov"),
                    rs.getBoolean("status_prov")
                );
                proveedores.add(proveedor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proveedores;
    }

    public void agregarProveedor(Proveedor proveedor) {
        String sql = "INSERT INTO tb_Proveedor (nombre_prov, direccion_prov, telefono_prov, status_prov) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, proveedor.getNombre());
            pstmt.setString(2, proveedor.getDireccion());
            pstmt.setString(3, proveedor.getTelefono());
            pstmt.setBoolean(4, proveedor.isStatus());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarProveedor(Proveedor proveedor) {
        String sql = "UPDATE tb_Proveedor SET nombre_prov = ?, direccion_prov = ?, telefono_prov = ?, status_prov = ? WHERE id_prov = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, proveedor.getNombre());
            pstmt.setString(2, proveedor.getDireccion());
            pstmt.setString(3, proveedor.getTelefono());
            pstmt.setBoolean(4, proveedor.isStatus());
            pstmt.setInt(5, proveedor.getId());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarProveedor(int id) {
        String sql = "DELETE FROM tb_Proveedor WHERE id_prov = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
