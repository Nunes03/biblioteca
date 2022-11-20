package main.java.br.com.biblioteca.utilitarios.constantes;

public class ConsultasConstante {

    private ConsultasConstante() {
    }

    public class Autor {

        public static final String CRIAR = "INSERT INTO biblioteca.autor"
            + "(nome)"
            + " VALUES "
            + "(?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.autor autor "
            + "SET "
            + "autor.nome = ? "
            + "WHERE autor.id = ?";

        public static final String BUSCAR = "SELECT * FROM biblioteca.autor;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.autor autor "
            + "WHERE autor.id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.autor;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.autor WHERE id = ?;";

        public static final String ACERVO_VINCULADO = "SELECT * FROM biblioteca.autor_acervo vinculo "
            + "WHERE vinculo.autor_id = ?;";
    }

    public class Cliente {

        public static final String CRIAR = "INSERT INTO biblioteca.cliente"
            + "(nome_completo, data_nascimento, cpf, telefone, ativo, foto)"
            + " VALUES "
            + "(?, ?, ?, ?, ?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.cliente cliente "
            + "SET "
            + "cliente.nome_completo = ?,"
            + "cliente.data_nascimento = ?,"
            + "cliente.cpf = ?,"
            + "cliente.telefone = ?,"
            + "cliente.ativo = ?,"
            + "cliente.foto = ? "
            + "WHERE cliente.id = ?;";
        
        public static final String INATIVAR = "UPDATE biblioteca.cliente cliente "
            + "SET "
            + "cliente.ativo = false "
            + "WHERE cliente.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.cliente;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.cliente cliente "
            + "WHERE cliente.id = ?;";

        public static final String BUSCAR_ATIVOS = "SELECT * FROM biblioteca.cliente cliente WHERE cliente.ativo = true;";

        public static final String BUSCAR_POR_CPF = "SELECT * FROM biblioteca.cliente cliente "
            + "WHERE cliente.cpf = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.cliente;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.cliente cliente "
            + "WHERE cliente.id = ?;";
    }

    public class Compra {

        public static final String CRIAR = "INSERT INTO biblioteca.compra"
            + "(compra.data, compra.total, compra.cliente_id)"
            + " VALUES "
            + "(?, ?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.compra compra "
            + "SET "
            + "compra.data = ?,"
            + "compra.total = ?,"
            + "compra.cliente_id = ? "
            + "WHERE compra.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.compra;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.compra compra "
            + "WHERE compra.id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.compra;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.compra compra "
            + "WHERE compra.id = ?;";
    }

    public class ItemCompra {

        public static final String CRIAR = "INSERT INTO biblioteca.item_compra item_compra"
            + "(item_compra.compra_id, item_compra.acervo_id)"
            + " VALUES "
            + "('?', ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.item_compra item_compra "
            + "SET "
            + "item_compra.compra_id = ?, "
            + "item_compra.acervo_id = ? "
            + "WHERE item_compra.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.item_compra;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.item_compra;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = ?;";
    }

    public class Livro {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo acervo "
            + "(acervo.nome, acervo.descricao, acervo.valor, "
            + "acervo.data_lancamento, acervo.paginas, acervo.editora, "
            + "acervo.capa_dura, acervo.genero) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?, ?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.descricao = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.capa_dura = ?, "
            + "acervo.genero = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
    }

    public class Periodico {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo acervo "
            + "(acervo.nome, acervo.valor, "
            + "acervo.data_lancamento, acervo.paginas, acervo.regiao, acervo.editora) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.regiao = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
    }

    public class Revista {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo acervo "
            + "(acervo.nome, acervo.valor, "
            + "acervo.data_lancamento, acervo.paginas, "
            + "acervo.editora, acervo.edicao) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.edicao = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
    }
}
