package steps;

import io.cucumber.java.pt.*;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class LoginSteps {

    private String mensagem;
    private String usuarioInformado;
    private String senhaInformada;

    private Map<String, String> bancoUsuarios = new HashMap<>();

    @Dado("que o usuário esteja na tela de login")
    public void o_usuario_esta_na_tela_de_login() {
        bancoUsuarios.put("joao", "1234");
    }

    @Quando("o usuário digitar o nome de usuário {string} e a senha {string}")
    public void o_usuario_digita_o_nome_de_usuario_e_a_senha(String usuario, String senha) {
        this.usuarioInformado = usuario;
        this.senhaInformada = senha;
    }

    @Quando("clicar no botão de login")
    public void clicar_no_botao_de_login() {
        String senhaCorreta = bancoUsuarios.get(usuarioInformado);
        if (senhaCorreta != null && senhaCorreta.equals(senhaInformada)) {
            mensagem = "Login realizado com sucesso";
        } else {
            mensagem = "Usuário ou senha inválidos";
        }
    }

    @Então("o sistema deve mostrar a mensagem {string}")
    public void o_sistema_deve_mostrar_a_mensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, mensagem);
    }
}
