package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerInicial {

    @FXML
    private Button buttonCadastro;

    @FXML
    private Text cadastro;

    @FXML
    private TextField emailInput;

    @FXML
    private AnchorPane pano;

    @FXML
    private Pane pano2;

    @FXML
    private Pane pano3;

    @FXML
    private Text pedeEmail;

    @FXML
    private Text pedeSenha;

    @FXML
    private TextField senhaInput;

    @FXML
    private Text titulo;

    @FXML
    public void carregaOutraPagina(ActionEvent event) {
        try {
            Pessoa p = new Pessoa(emailInput.getText(), senhaInput.getText());

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXMLs/telaFinal.fxml"));
            Parent secondView = loader.load();
            
            ControllerFinal tFinal = loader.getController();
            tFinal.exibeInformacoes(p);

            Scene scene = new Scene(secondView);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}