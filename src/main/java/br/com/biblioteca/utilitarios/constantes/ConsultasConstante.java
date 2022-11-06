package main.java.br.com.biblioteca.utilitarios.constantes;

public class ConsultasConstante {

    private ConsultasConstante() {
    }

    public static class Autor {
        public static final String CRIAR = "INSERT INTO biblioteca.autor"
            + "(nome)"
            + " VALUES "
            + "('%s');";

        public static final String ATUALIZAR = "UPDATE biblioteca.autor autor "
            + "SET "
            + "nome = '%s' "
            + "WHERE autor.id = %d";

        public static final String BUSCAR = "SELECT * FROM biblioteca.autor;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.autor autor "
            + "WHERE autor.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.autor;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.autor autor "
            + "WHERE autor.id = %d;";
    }

    public static class Cliente {
        public static final String CRIAR = "INSERT INTO biblioteca.cliente"
            + "(nome_completo, data_nascimento, cpf, telefone)"
            + " VALUES "
            + "('%s', '%s', '%s', '%s');";

        public static final String ATUALIZAR = "UPDATE biblioteca.cliente cliente "
            + "SET "
            + "nome_completo = '%s',"
            + "data_nascimento = '%s',"
            + "cpf = '%s',"
            + "telefone = '%s' "
            + "WHERE cliente.id = %d;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.cliente;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.cliente cliente "
            + "WHERE cliente.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.cliente;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.cliente cliente "
            + "WHERE cliente.id = %d;";
    }

    public static class Compra {
        public static final String CRIAR = "INSERT INTO biblioteca.compra"
            + "(compra.data, compra.total, compra.cliente_id)"
            + " VALUES "
            + "('%s', '%s', %d);";

        public static final String ATUALIZAR = "UPDATE biblioteca.compra compra "
            + "SET "
            + "compra.data = '%s',"
            + "compra.total = '%s',"
            + "compra.cliente_id = %d "
            + "WHERE compra.id = %d;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.compra;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.compra compra "
            + "WHERE compra.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.compra;";

        public static final String DELETE_POR_ID = "DELETE FROM biblioteca.compra compra "
            + "WHERE compra.id = %d;";
    }

    public static class ItemCompra {
        public static final String CRIAR = "INSERT INTO biblioteca.item_compra item_compra"
            + "(item_compra.compra_id, item_compra.acervo_id)"
            + " VALUES "
            + "('%d', %d);";

        public static final String ATUALIZAR = "UPDATE biblioteca.item_compra item_compra "
            + "SET "
            + "item_compra.compra_id = %d, "
            + "item_compra.acervo_id = %d "
            + "WHERE item_compra.id = %d;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.item_compra;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.item_compra;";

        public static final String DELETE_POR_ID = "DELETE FROM biblioteca.item_compra item_compra "
            + "WHERE item_compra.id = %d;";
    }

    public static class Livro {
        public static final String CRIAR = "INSERT INTO biblioteca.acervo acervo "
            + "(acervo.nome, acervo.descricao, acervo.valor, "
            + "acervo.data_lancamento, acervo.paginas, acervo.editora, "
            + "acervo.capa_dura, acervo.genero)"
            + " VALUES "
            + "('%s', '%s', %f, '%s', %d, '%s', %b, '%s');";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = '%s', "
            + "acervo.descricao = '%s', "
            + "acervo.valor = %f, "
            + "acervo.data_lancamento = '%s', "
            + "acervo.paginas = %d, "
            + "acervo.editora = '%s', "
            + "acervo.capa_dura = %b, "
            + "acervo.genero = '%s' "
            + "WHERE acervo.id = %d;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = %d;";
    }

    public static class Periodico {
        public static final String CRIAR = "INSERT INTO biblioteca.acervo acervo "
            + "(acervo.nome, acervo.valor, "
            + "acervo.data_lancamento, acervo.paginas, acervo.regiao, acervo.editora) "
            + "VALUES "
            + "('%s', %f, '%s', %d, '%s', '%s');";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = '%s', "
            + "acervo.valor = %f, "
            + "acervo.data_lancamento = '%s', "
            + "acervo.paginas = %d, "
            + "acervo.editora = '%s', "
            + "acervo.regiao = '%s' "
            + "WHERE acervo.id = %d;";
        
        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = %d;";
    }

    public static class Revista {
        public static final String CRIAR = "INSERT INTO biblioteca.acervo acervo "
            + "(acervo.nome, acervo.valor, "
            + "acervo.data_lancamento, acervo.paginas, "
            + "acervo.editora, acervo.edicao) "
            + "VALUES "
            + "('%s', %f, '%s', %d, '%s', %d);";

        public static final String ATUALIZAR = "UPDATE biblioteca.acervo acervo "
            + "SET "
            + "acervo.nome = '%s', "
            + "acervo.valor = %f, "
            + "acervo.data_lancamento = '%s', "
            + "acervo.paginas = %d, "
            + "acervo.editora = '%s', "
            + "acervo.edicao = %d "
            + "WHERE acervo.id = %d;";

        public static final String BUSCAR = "SELECT * FROM biblioteca.acervo;";

        public static final String BUSCAR_POR_ID = "SELECT * FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = %d;";

        public static final String DELETAR = "DELETE FROM biblioteca.acervo;";

        public static final String DELETAR_POR_ID = "DELETE FROM biblioteca.acervo acervo "
            + "WHERE acervo.id = %d;";
    }
}