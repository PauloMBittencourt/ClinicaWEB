
package app;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author paulo
 */
@ManagedBean
@SessionScoped
public class UsuarioBeans {
    private String login, senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String logarSistema(){
        String pagina = "";
        if(login.equals("admin")& senha.equals("admin")){
            pagina = "Cadastro";
        }else{pagina = "loginMSG";}
        return pagina; // return o nome da pagina que será aberta
    }
    public String voltar(){
        return "login1";
    }
    public UsuarioBeans() {
        
    }
    
}
