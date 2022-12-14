CREATE DATABASE IF NOT EXISTS biblioteca;
/*DROP DATABASE biblioteca;*/

CREATE TABLE IF NOT EXISTS biblioteca.cliente (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome_completo VARCHAR(150) NOT NULL,
    data_nascimento DATE NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    ativo BOOLEAN NOT NULL,
    foto MEDIUMBLOB NOT NULL,
    UNIQUE (cpf)
);

CREATE TABLE IF NOT EXISTS biblioteca.compra (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    data DATE NOT NULL,
    total DOUBLE NOT NULL,
    cliente_id INT NOT NULL,
    FOREIGN KEY (cliente_id) 
        REFERENCES biblioteca.cliente(id)
);

CREATE TABLE IF NOT EXISTS biblioteca.acervo (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(500),
    valor DOUBLE NOT NULL,
    data_lancamento DATE NOT NULL,
    paginas INT NOT NULL,
    editora VARCHAR(100) NOT NULL,
    autor VARCHAR(300) NOT NULL,
    foto MEDIUMBLOB NOT NULL,
    capa_dura BOOLEAN,
    genero VARCHAR(50),
    regiao VARCHAR(100),
    edicao INT,
    ativo BOOLEAN NOT NULL,
    tipo VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS biblioteca.item_compra (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    compra_id INT NOT NULL,
    acervo_id INT NOT NULL,
    FOREIGN KEY (compra_id) 
        REFERENCES biblioteca.compra(id),
    FOREIGN KEY (acervo_id) 
        REFERENCES biblioteca.acervo(id)
);