create database bd_biblioteca;

use bd_biblioteca;

--
-- Tabela de Usuários (entidade Usuarios)
--
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--
-- Tabela de Livros (entidade Livros)
--
CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    disponivel BOOLEAN DEFAULT TRUE,
    ano_publicacao INT
);

--
-- Tabela de Empréstimos (entidade Emprestimos)
--
CREATE TABLE emprestimos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_livro INT NOT NULL,
    id_usuario INT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    status VARCHAR(50) NOT NULL DEFAULT 'Ativo',
    
    FOREIGN KEY (id_livro) REFERENCES livros(id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);