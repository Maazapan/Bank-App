package io.github.maazapan.bank.manager.sql;

import java.sql.*;
import java.util.UUID;

public class SQLManager {

    private Connection connection;

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            this.createTable();

            System.out.println("Connected to database!");

        } catch (Exception e) {
            System.out.println("Failed to connect to database!");
            e.printStackTrace();
        }
    }

    private void createTable() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS bank (account_id TEXT, name TEXT, date TEXT, money DOUBLE)");
    }

    /**
     * Inserta los datos necesarios para la cuenta
     *
     * @param accountID ID de la cuenta
     * @param name      Nombre de la persona
     * @param money     Dinero que tiene la persona
     */
    public void insertData(UUID accountID, String name, String date, double money) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO bank (account_id, name, date, money) VALUES (" + accountID.toString() + ", " + name + ", " + date + ", " + money + ")");
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Obtiene el dinero actual de la cuenta.
     *
     * @param accountID El ID de la cuenta.
     * @return El dinero actual de la cuenta.
     */
    public double getMoney(UUID accountID) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bank WHERE account_id = " + accountID.toString());
            ResultSet resultSet = statement.executeQuery();

            return resultSet.getInt("money");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Cambia el dinero actual de la cuenta.
     *
     * @param money     El dinero que se quiere poner.
     * @param accountID El ID de la cuenta.
     */
    public void setMoney(double money, UUID accountID) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bank WHERE account_id = " + accountID.toString());
            statement.setDouble(4, money);
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
