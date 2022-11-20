package main.java.br.com.biblioteca.enums;

public enum GeneroEnum {

    ROMANCE(1),
    TERROR(2),
    ACAO(3),
    SUSPENSE(4);

    private Integer ordem;

    GeneroEnum(Integer ordem) {
        this.ordem = ordem;
    }

    public Integer getOrdem() {
        return ordem;
    }
}
