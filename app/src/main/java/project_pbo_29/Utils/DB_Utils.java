package project_pbo_29.Utils;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.sql.*;

import project_pbo_29.Scenes.ChatScene;

public class DB_Utils extends SQlite_Utils{
    private Stage stage;
    PreparedStatement cekUserExists = null;
    ResultSet resultSet = null;
    
    public DB_Utils(Stage stage){
        this.stage = stage;
    }  

    public void signUpUser(ActionEvent event, String username, String password) {
        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Username and Password cannot be empty!");
            alert.show();
            return;
        }

        PreparedStatement cekInsert = null;
        PreparedStatement cekUserExists = null;
        ResultSet resultSet = null;
        try {
            getConnection();
            cekUserExists = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            cekUserExists.setString(1, username);
            resultSet = cekUserExists.executeQuery();

            if (resultSet.isBeforeFirst()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Sorry, Username Already Taken!");
                alert.show();
            } else {
                cekInsert = connection.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
                cekInsert.setString(1, username);
                cekInsert.setString(2, password);
                cekInsert.executeUpdate();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Account Created Successfully!");
                alert.show();
                ChatScene chatScene = new ChatScene(stage,username,password);
                ScreenSizeUtils.saveScreenSize(stage);
                chatScene.showScene();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cekUserExists != null) {
                try {
                    cekUserExists.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cekInsert != null) {
                try {
                    cekInsert.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void loginUser(ActionEvent event, String username, String password) {
        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Username and Password cannot be empty!");
            alert.show();
            return;
        }
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            getConnection();
            preparedStatement = connection.prepareStatement("SELECT password FROM users WHERE username = ?");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("User Not Found!");
                alert.show();
            } else {
                while (resultSet.next()) {
                    String passwordDariDB = resultSet.getString("password");
                    if (passwordDariDB.equals(password)) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Login Successful!");
                        alert.show();
                        ChatScene chatScene = new ChatScene(stage,username,password);
                        ScreenSizeUtils.saveScreenSize(stage);
                        chatScene.showScene();
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Password did not Match!");
                        alert.show();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void updateUsernameInDatabase(String oldUsername, String newUsername) {
        PreparedStatement preparedStatement = null;

        try {
            getConnection();
            preparedStatement = connection.prepareStatement("UPDATE users SET username = ? WHERE username = ?");
            preparedStatement.setString(1, newUsername);
            preparedStatement.setString(2, oldUsername);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void updatePasswordInDatabase(String username, String newPassword) {
        PreparedStatement preparedStatement = null;

        try {
            getConnection();
            preparedStatement = connection.prepareStatement("UPDATE users SET password = ? WHERE username = ?");
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
