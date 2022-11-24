package main.java.br.com.biblioteca.utilitarios.conversores;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.br.com.biblioteca.entidades.*;
import main.java.br.com.biblioteca.enums.GeneroEnum;

public class ConversorEntidade {

    private ConversorEntidade() {
    }

    public static ClienteEntidade resultSetParaCliente(ResultSet resultSet) {
        try {
            return new ClienteEntidade(
                resultSet.getInt("id"),
                resultSet.getString("nome_completo"),
                resultSet.getDate("data_nascimento"),
                resultSet.getString("cpf"),
                resultSet.getString("telefone"),
                resultSet.getBoolean("ativo"),
                resultSet.getBytes("foto")
            );
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static CompraEntidade resultSetParaCompra(ResultSet resultSet) {
        try {
            return new CompraEntidade(
                resultSet.getInt("id"),
                resultSet.getDate("data"),
                resultSet.getDouble("total"),
                new ClienteEntidade(resultSet.getInt("cliente_id"))
            );
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static ItemCompraEntidade resultSetParaItemCompra(ResultSet resultSet) {
        try {
            return new ItemCompraEntidade(
                resultSet.getInt("id"),
                new CompraEntidade(
                    resultSet.getInt("compra_id")
                ),
                new AcervoEntidade(
                    resultSet.getInt("acervo_id")
                )
            );
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static LivroEntidade resultSetParaLivro(ResultSet resultSet) {
        try {
            return new LivroEntidade(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getDate("data_lancamento"),
                resultSet.getInt("paginas"),
                resultSet.getString("editora"),
                resultSet.getString("autor"),
                resultSet.getBytes("foto"),
                resultSet.getString("descriao"),
                resultSet.getBoolean("capa_dura"),
                GeneroEnum.valueOf(resultSet.getString("genero")),
                resultSet.getBoolean("ativo")
            );
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static PeriodicoEntidade resultSetParaPeriodico(ResultSet resultSet) {
        try {
            return new PeriodicoEntidade(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getDate("data_lancamento"),
                resultSet.getInt("paginas"),
                resultSet.getString("editora"),
                resultSet.getString("autor"),
                resultSet.getBytes("foto"),
                resultSet.getString("regiao"),
                resultSet.getBoolean("ativo")
            );
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static RevistaEntidade resultSetParaRevista(ResultSet resultSet) {
        try {
            return new RevistaEntidade(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getDate("data_lancamento"),
                resultSet.getInt("paginas"),
                resultSet.getString("editora"),
                resultSet.getString("autor"),
                resultSet.getBytes("foto"),
                resultSet.getInt("edicao"),
                resultSet.getBoolean("ativo")
            );
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
