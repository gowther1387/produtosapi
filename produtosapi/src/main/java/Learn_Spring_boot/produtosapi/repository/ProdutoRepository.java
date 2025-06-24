package Learn_Spring_boot.produtosapi.repository;

import Learn_Spring_boot.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String>{
      List<Produto> findByNome(String nome);
}
