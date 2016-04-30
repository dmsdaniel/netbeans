/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.daniel.mavenproject1.dao.FuncionarioDAO;
import com.daniel.mavenproject1.modelo.Funcionario;
import com.daniel.mavenproject1.modelo.Sexo;

/**
 *
 * @author daniel
 */
public class MainClass {
    public static void main(String[] args) {
   
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Daniel 2");
        funcionario.setMatricula("07977248859");
        funcionario.setSexo(Sexo.MASCULINO);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.salvar(funcionario);
     
    }
    
}
