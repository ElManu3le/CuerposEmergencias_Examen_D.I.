package PruevaEx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

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

        this.idColum.setCellValueFactory(new PropertyValueFactory("idUnidad"));

        this.udColum.setCellValueFactory(new PropertyValueFactory("tipo_Ud"));

        this.idTrabajadorColum.setCellValueFactory(new PropertyValueFactory("idTrabajador"));

        this.nombreTrabajadorColum.setCellValueFactory(new PropertyValueFactory("nombreTrabajador"));

        this.provinciasNombre.setCellValueFactory(new PropertyValueFactory("provincia"));

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

        }

    }

    @FXML
    private void agregarBomberos(ActionEvent event) {

        String idUnidad = this.txtIdentificacionUd.getText();

        String idTrabajador = this.txtIdTrbajador.getText();

        String tipo_Ud = this.txtIdentificacionUd.getText();

        String nombreTrabajador = this.txtNombreTrabajador.getText();

        String provincia = this.txtProvincia.getText();

        Emergencia p = new Emergencia(idUnidad, idTrabajador, tipo_Ud, nombreTrabajador, provincia);

        if (!this.bomberos.contains(p)) {
            this.emergencias.add(p);
            this.tblUnidades.setItems(emergencias);

        }

    }

    @FXML
    private void agregarPolicias(ActionEvent event) {
        String idUnidad = this.txtIdentificacionUd.getText();

        String idTrabajador = this.txtIdTrbajador.getText();

        String tipo_Ud = this.txtIdentificacionUd.getText();

        String nombreTrabajador = this.txtNombreTrabajador.getText();

        String provincia = this.txtProvincia.getText();
        Emergencia p = new Emergencia(idUnidad, idTrabajador, tipo_Ud, nombreTrabajador, provincia);

        if (!this.policias.contains(p)) {
            this.emergencias.add(p);
            this.tblUnidades.setItems(emergencias);

        }

    }

    @FXML
    private void agregarAmbulancias(ActionEvent event) {
        String idUnidad = this.txtIdentificacionUd.getText();

        String idTrabajador = this.txtIdTrbajador.getText();

        String tipo_Ud = this.txtIdentificacionUd.getText();

        String nombreTrabajador = this.txtNombreTrabajador.getText();

        String provincia = this.txtProvincia.getText();

        Emergencia p = new Emergencia(idUnidad, idTrabajador, tipo_Ud, nombreTrabajador, provincia);

        if (!this.ambulancias.contains(p)) {
            this.emergencias.add(p);
            this.tblUnidades.setItems(emergencias);

        }

    }

    @FXML
    private void modificar(ActionEvent event) {

        Emergencia e = (Emergencia) this.tblUnidades.getSelectionModel().getSelectedItem();
        if (e == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Selecciona algo leñe");
            alert.showAndWait();

        } else {

            try {
                String idUnidad = this.txtIdentificacionUd.getText();

                String idTrabajador = this.txtIdTrbajador.getText();

                String tipo_Ud = this.txtNombre.getText();

                String nombreTrabajador = this.txtNombreTrabajador.getText();

                String provincia = this.txtProvincia.getText();
                Emergencia eux = new Emergencia(idUnidad, idTrabajador, tipo_Ud, nombreTrabajador, provincia);

                if (!this.emergencias.contains(eux)) {

                    e.setIdUnidad(eux.getIdUnidad());
                    e.setIdTrabajador(eux.getIdTrabajador());
                    e.setTipo_Ud(eux.getTipo_Ud());
                    e.setNombreTrabajador(eux.getNombreTrabajador());
                    e.setProvincia(eux.getProvincia());

                    this.tblUnidades.refresh();

                }

            } catch (NumberFormatException ex) {
                // TODO: handle exception
            }

        }

    }

    @FXML
    private void borrar(ActionEvent event) {

        Emergencia e = (Emergencia) this.tblUnidades.getSelectionModel().getSelectedItem();
        if (e == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Selecciona algo leñe");
            alert.showAndWait();

        } else {

            this.emergencias.remove(e);
            this.tblUnidades.refresh();

        }

    }

    @FXML
    private void seleccionar(MouseEvent event) {

        Emergencia e = (Emergencia) this.tblUnidades.getSelectionModel().getSelectedItem();
        if (e != null) {

            this.txtIdTrbajador.setText(e.getIdTrabajador());
            this.txtIdentificacionUd.setText(e.getIdUnidad());
            this.txtNombre.setText(e.getTipo_Ud());
            this.txtProvincia.setText(e.getProvincia());
            this.txtNombreTrabajador.setText(e.getNombreTrabajador());

        }

    }

    @FXML
    private void mostrarUnidades(ActionEvent event) {
        System.out.println(emergencias);

    }

}