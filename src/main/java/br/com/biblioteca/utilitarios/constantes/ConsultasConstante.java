package main.java.br.com.biblioteca.utilitarios.constantes;

public class ConsultasConstante {

    private ConsultasConstante() {
    }

    public class Tipo {

        public static final int LIVRO = 1;

        public static final int REVISTA = 2;

        public static final int PERIODICO = 3;
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

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.cliente cliente GROUP BY cliente.id DESC LIMIT 1;";

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

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.compra compra GROUP BY compra.id DESC LIMIT 1;";

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

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.item_compra item_compra GROUP BY item_compra.id DESC LIMIT 1;";

        public static final String DELETAR = "DELETE FROM biblioteca.item_compra;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = ?;";
    }

    public class Livro {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo "
            + "(nome, descricao, valor, data_lancamento, paginas, editora, "
            + "autor, capa_dura, genero, tipo) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?, ?, ?, ?, 1);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.descricao = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.autor = ?, "
            + "acervo.capa_dura = ?, "
            + "acervo.genero = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.tipo = 1 "
            + "GROUP BY acervo.id DESC LIMIT 1;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
    }

    public class Revista {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo "
            + "(nome, valor, data_lancamento, paginas, editora, autor, foto, edicao, ativo, tipo) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?, ?, ?, ?, 2);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.autor = ?, "
            + "acervo.edicao = ?, "
            + "acervo.ativo = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo WHERE acervo.tipo = 2;";

        public static final String BUSCAR_ATIVOS = "SELECT * FROM biblioteca.acervo "
            + "WHERE "
            + "acervo.ativo = true AND acervo.tipo = 2;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
        
        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.tipo = 2 "
            + "GROUP BY acervo.id DESC LIMIT 1;";
        
        public static final String DELETAR = "DELETE FROM biblioteca.acervo "
            + "WHERE acervo.tipo = 2;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
    }

    public class Periodico {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo "
            + "(nome, valor, data_lancamento, paginas, regiao, editora, autor, tipo) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?, ?, 3);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.autor = ?, "
            + "acervo.regiao = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ? AND acervo.tipo = 3;";

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.tipo = 3 "
            + "GROUP BY acervo.id DESC LIMIT 1;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = ?;";
    }
}
