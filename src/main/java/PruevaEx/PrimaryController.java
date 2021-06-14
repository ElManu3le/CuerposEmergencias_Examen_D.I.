package PruevaEx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtIdentificacionUd;

    @FXML
    private TextField txtNombreTrabajador;

    @FXML
    private TextField txtIdTrbajador;

    @FXML
    private TextField txtProvincia;

    @FXML
    private TableColumn idColum;

    @FXML
    private TableColumn udColum;

    @FXML
    private TableColumn idTrabajadorColum;

    @FXML
    private TableColumn nombreTrabajadorColum;

    @FXML
    private TableColumn provinciasNombre;

    @FXML
    private TableView tblUnidades;

    private ObservableList<Emergencia> emergencias;
    private ObservableList<Bomberos> bomberos;
    private ObservableList<Policia> policias;
    private ObservableList<Ambulancia> ambulancias;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        emergencias = FXCollections.observableArrayList();

        // this.columPolicia.setCellValueFactory(new PropertyValueFactory("nombre"));
        // this.ApellCol.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.idColum.setCellValueFactory(new PropertyValueFactory("idUnidad"));

        this.udColum.setCellValueFactory(new PropertyValueFactory("tipo_Ud"));

        this.idTrabajadorColum.setCellValueFactory(new PropertyValueFactory("idTrabajador"));

        this.nombreTrabajadorColum.setCellValueFactory(new PropertyValueFactory("nombreTrabajador"));

        this.provinciasNombre.setCellValueFactory(new PropertyValueFactory("provincia"));

        bomberos = FXCollections.observableArrayList();
           

    }

    @FXML
    private void agregarCuerpo(ActionEvent event) {

        String idUnidad = this.txtIdentificacionUd.getText();

        String idTrabajador = this.txtIdTrbajador.getText();

        String tipo_Ud = this.txtNombre.getText();

        String nombreTrabajador = this.txtNombreTrabajador.getText();

        String provincia = this.txtProvincia.getText();

        Emergencia p = new Emergencia(idUnidad, idTrabajador, tipo_Ud, nombreTrabajador, provincia);

        if (!this.emergencias.contains(p)) {

            this.emergencias.add(p);
            this.tblUnidades.setItems(emergencias);

        } else {

        }

    }

    @FXML
    private void mostrarUnidades(ActionEvent event) {
        System.out.println(emergencias);

    }

}
