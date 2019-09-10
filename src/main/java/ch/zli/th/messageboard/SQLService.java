package ch.zli.th.messageboard;

import java.sql.*;

public class SQLService {

    public String sqlcommand(String query) {
        try {
            String myDriver = "java.sql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/theboard";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.close();
            return rs.getString("*");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
