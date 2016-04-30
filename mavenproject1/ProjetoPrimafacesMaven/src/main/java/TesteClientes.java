
import com.daniel.mavenproject1.modelo.Cliente;
import com.daniel.mavenproject1.dao.ClienteDao;

/**
 *
 * @author daniel
 */
public class TesteClientes {

    public static void main(String[] args) {
        Cliente p = new Cliente();

        p.setNome("Gabriel");
        p.setIdade(19);

        Cliente p2 = new Cliente();

        p2.setNome("José");
        p2.setIdade(72);

        Cliente p3 = new Cliente();

        p3.setNome("Maria");
        p3.setIdade(27);

        Cliente p4 = new Cliente();

        p4.setNome("Rodolfo");
        p4.setIdade(16);

        ClienteDao clientedao = new ClienteDao();
        
        
        clientedao.salvar(p);
        
        clientedao.salvar(p2);
        clientedao.salvar(p3);
        clientedao.salvar(p4); 

        clientedao.remover(p2.getId());
        
        for(Cliente pe : clientedao.findAll()){
            System.out.println(pe.getId());
            System.out.println(pe.getNome());
            System.out.println();
        }

    }
}
