
import java.util.Date;
import modelo.Endereco;
import modelo.Paciente;
import negocio.PacienteNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ighor
 */
public class TesteCadastroPaciente {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        
        paciente.setNome("João");
        paciente.setCpf("12345678901");
        paciente.setDataNascimento(new Date());
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua do Jão");
        endereco.setNumero("3a");
        endereco.setBairro("Centro");
        
        paciente.setEndereco(endereco);

        PacienteNegocio pn = new PacienteNegocio();
        pn.cadastrar(paciente);
        
        Paciente p2 = new Paciente();
        p2.setNome("JESSIE");
        
        pn.cadastrar(p2);
        
        paciente.getEndereco().setCep("78888888");
        
        pn.alterar(paciente);
        
        System.out.println("FIM");
        
    }
}
