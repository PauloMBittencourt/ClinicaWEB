/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author paulo
 */
@ManagedBean
@SessionScoped
public class CadastroBeans {

    public String cadastroPaciente(){
        return "CadastroPaciente";
    }
    public String cadastroMedico(){
        return "CadastroMedico";
    }
    public String cadastroAtedente(){
        return "CadastroAtendente";
    } 
    
}
