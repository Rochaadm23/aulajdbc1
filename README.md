# Aula jdbc

JDBC (Java Database Connectivity)

- Checklist:

- Usando o MySQL Workbench, crie uma base de dados chamada "coursejdbc"
- Baixar o MySQL Java Connector
- Caso ainda não exista, criar uma User Library contendo o arquivo .jar do driver do MySQL o Window -> Preferences ->
  Java -> Build path -> User Libraries o Dê o nome da User Library de MySQLConnector o Add external JARs -> (localize o
  arquivo jar)
- Criar um novo Java Project o Acrescentar a User Library MySQLConnector ao projeto
- Na pasta raiz do projeto, criar um arquivo "db.properties" contendo os dados de conexão:
  user=developer password=1234567 dburl=jdbc:mysql://localhost:3306/coursejdbc useSSL=false
- No pacote "db", criar uma exceção personalizada DbException
- No pacote "db", criar uma classe DB com métodos estáticos auxiliares o Obter e fechar uma conexão com o banco

## READ DATA

Script SQL: material de apoio ou https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql
Código fonte: https://github.com/acenelio/jdbc2

- API:
    - Statement
    - ResultSet
        - o first() [move para posição 1, se houver]
        - o beforeFirst() [move para posição 0]
        - o next() [move para o próximo, retorna false se já estiver no último]
        - o absolute(int) [move para a posição dada, lembrando que dados reais começam em 1]
- Checklist:
    - Usar o script SQL para criar a base de dados "coursejdbc"
    - Fazer um pequeno programa para recuperar os departamentos
    - Na classe DB, criar métodos auxiliares estáticos para fechar ResultSet e Statement

## CREATE DATA

- API:
    - PreparedStatement
    - executeUpdate
    - Statement.RETURN_GENERATED_KEYS
    - getGeneratedKeys
- Checklist:
    - Inserção simples com preparedStatement
    - Inserção com recuperação de Id

## UPDATE DATA
- API:
  - PreparedStatement
  - executeUpdate
- Checklist:
    - Atualização simples com preparedStatement