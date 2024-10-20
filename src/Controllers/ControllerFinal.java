package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerFinal {
    @FXML
    private Text agradecimento;

    @FXML
    private Button button;

    @FXML
    private Text email;

    @FXML
    private Text nome;

    @FXML
    private Text pedeEmail;

    @FXML
    private Text pedeSenha;

    @FXML
    private AnchorPane root;

    @FXML
    private Text senha;

    @FXML
    private Text welcome;

    @FXML
    public void initialize() {
        String css = getClass().getResource("../styles/style2.css").toExternalForm();
        root.getStylesheets().add(css);
    }

    public void exibeInformacoes(Pessoa p) {
        email.setText(p.getemail());
        senha.setText(p.getSenha());
    }

    @FXML
    public void voltar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXMLs/telaInicial.fxml"));
            Parent secondView = loader.load();
    
            Scene scene = new Scene(secondView);
            
            String css = getClass().getResource("../styles/style.css").toExternalForm();
            scene.getStylesheets().add(css);
    
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}