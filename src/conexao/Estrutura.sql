DROP DATABASE IS EXISTS bancoMysql;
CREATE DATABASE IF NOT EXIST bancoMysql;

USE bancoMysql;

CREATE TABLE alunos(
    id                                  INT AUTO_INCREMENT PRIMARY KEY,
    nome                                VARCHAR(100) NOT NULL,
    codigo_da_matricula                 VARCHAR(11),
    nota1                               FLOAT NOT NULL,
    nota2                               FLOAT NOT NULL,
    nota3                               FLOAT NOT NULL,
    frequencia                          TINYINT
  
); 
