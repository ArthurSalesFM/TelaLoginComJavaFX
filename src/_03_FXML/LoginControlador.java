package _03_FXML;



import org.controlsfx.control.Notifications;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("teste@teste.com");
		boolean senhaValida = campoSenha.getText().equals("123456");
		
		if(emailValido && senhaValida ) {
			Notifications.create()
				.position(Pos.BOTTOM_CENTER)
				.title("Login FXML")
				.text("Login efetuado com sucesso!!!")
				.showInformation();
		}
		else {
			Notifications.create()
				.position(Pos.BOTTOM_CENTER)
				.title("Login FXML")
				.text("Usuário e/ou Senha Incorreto(s)!!!")
				.showError();
		}
		
//		System.out.println("Email : " + campoEmail.getText());
//		System.out.println("Senha : " + campoSenha.getText());
	}
}
