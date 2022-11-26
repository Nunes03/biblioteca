package main.java.br.com.biblioteca.utilitarios.constantes;

public class ConsultasConstante {

    private ConsultasConstante() {
    }

    public class Tipo {

        public static final int LIVRO = 1;

        public static final int REVISTA = 2;

        public static final int PERIODICO = 3;
    }
    
    public class Acervo {

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo "
            + "WHERE acervo.id = ?";
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

        public static final String BUSCAR_POR_NOME_LIKE = "SELECT * FROM biblioteca.cliente cliente "
            + "WHERE cliente.nome_completo LIKE ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.cliente;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.cliente cliente "
            + "WHERE cliente.id = ?;";
    }

    public class Compra {

        public static final String CRIAR = "INSERT INTO biblioteca.compra"
            + "(data, total, cliente_id)"
            + " VALUES "
            + "(?, ?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.compra compra "
            + "SET "
            + "compra.data = ?,"
            + "compra.total = ?,"
            + "compra.cliente_id = ? "
            + "WHERE compra.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.compra;";
        
        public static final String BUSCAR_DATA_INICIO_FIM = "SELECT * FROM biblioteca.compra compra "
                + "WHERE compra.data BETWEEN ? AND ?;";
        
        public static final String BUSCAR_DATA_MAIOR_IGUAL_QUE = "SELECT * FROM biblioteca.compra compra "
                + "WHERE compra.data >= ?;";
        
        public static final String BUSCAR_DATA_MENOR_IGUAL_QUE = "SELECT * FROM biblioteca.compra compra "
                + "WHERE compra.data <= ?;";
        
        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.compra compra "
            + "WHERE compra.id = ?;";

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.compra compra GROUP BY compra.id DESC LIMIT 1;";
        
        public static final String BUSCAR_POR_CLIENTE_ID = "SELECT * FROM biblioteca.compra compra "
            + "WHERE compra.cliente_id = ?;";

        public static final String DELETAR = "DELETE FROM biblioteca.compra;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.compra compra "
            + "WHERE compra.id = ?;";
    }

    public class ItemCompra {

        public static final String CRIAR = "INSERT INTO biblioteca.item_compra "
            + "(compra_id, acervo_id)"
            + " VALUES "
            + "(?, ?);";

        public static final String ATUALIZAR = "UPDATE biblioteca.item_compra item_compra "
            + "SET "
            + "item_compra.compra_id = ?, "
            + "item_compra.acervo_id = ? "
            + "WHERE item_compra.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.item_compra;";
        
        public static final String BUSCAR_POR_COMPRA_ID = "SELECT * FROM biblioteca.item_compra "
            + "WHERE item_compra.compra_id = ?;";
        
        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = ?;";

        public static final String BUSCAR_ULTIMO = "SELECT * FROM biblioteca.item_compra item_compra GROUP BY item_compra.id DESC LIMIT 1;";

        public static final String DELETAR = "DELETE FROM biblioteca.item_compra;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = ?;";
    }

    public class Livro {

        public static final String CRIAR = "INSERT INTO biblioteca.acervo "
            + "(nome, valor, data_lancamento, paginas, editora, autor, foto, ativo, descricao, capa_dura, genero, tipo) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.autor = ?, "
            + "acervo.foto = ?, "
            + "acervo.ativo = ?, "
            + "acervo.descricao = ?, "
            + "acervo.capa_dura = ?, "
            + "acervo.genero = ? "
            + "WHERE acervo.id = ?;";

        public static final String INATIVAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.ativo = false "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo "
            + "WHERE acervo.tipo = 1;";

        public static final String BUSCAR_ATIVOS = "SELECT * FROM biblioteca.acervo "
            + "WHERE "
            + "acervo.ativo = true AND acervo.tipo = 1 AND acervo.ativo = true;";

        public static final String BUSCAR_POR_NOME_E_ATIVOS_LIKE = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.nome LIKE ? AND acervo.tipo = 1;";

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

        public static final String INATIVAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.ativo = false "
            + "WHERE acervo.id = ?;";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.autor = ?, "
            + "acervo.foto = ?, "
            + "acervo.edicao = ?, "
            + "acervo.ativo = ? "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo WHERE acervo.tipo = 2;";

        public static final String BUSCAR_ATIVOS = "SELECT * FROM biblioteca.acervo "
            + "WHERE "
            + "acervo.ativo = true AND acervo.tipo = 2;";

        public static final String BUSCAR_POR_NOME_E_ATIVOS_LIKE = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.nome LIKE ? AND acervo.tipo = 2 AND acervo.ativo = true;";

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
            + "(nome, valor, data_lancamento, paginas, editora, autor, foto, regiao, ativo, tipo) "
            + "VALUES "
            + "(?, ?, ?, ?, ?, ?, ?, ?, ?, 3);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = ?, "
            + "acervo.valor = ?, "
            + "acervo.data_lancamento = ?, "
            + "acervo.paginas = ?, "
            + "acervo.editora = ?, "
            + "acervo.autor = ?, "
            + "acervo.foto = ?, "
            + "acervo.regiao = ?, "
            + "acervo.ativo = ? "
            + "WHERE acervo.id = ?;";

        public static final String INATIVAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.ativo = false "
            + "WHERE acervo.id = ?;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo "
            + "WHERE acervo.tipo = 3;";

        public static final String BUSCAR_ATIVOS = "SELECT * FROM biblioteca.acervo "
            + "WHERE "
            + "acervo.ativo = true AND acervo.tipo = 3;";

        public static final String BUSCAR_POR_NOME_E_ATIVOS_LIKE = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.nome LIKE ? AND acervo.tipo = 3 AND acervo.ativo = true;";

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
