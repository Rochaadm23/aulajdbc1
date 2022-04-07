package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // Atualizando dados do DB
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE seller " +
                    "set BaseSalary = BaseSalary + ? " +
                    "where " +
                    "(DepartmentId = ?)");

            ps.setDouble(1, 200.0);
            ps.setInt(2, 2);

            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();

        }
    }
}
