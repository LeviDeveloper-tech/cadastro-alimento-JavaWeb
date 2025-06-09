package ap3.cadastro.alimento.util;


public class CriarTabela {

    public static void main(String[] args) {
        JPAUtil.getEntityManager().close(); // Apenas para forçar a inicialização e fechar a conexão
        System.out.println("Verifique o console para logs de CREATE TABLE/ALTER TABLE do Hibernate.");
        System.out.println("Agora, verifique seu banco de dados PostgreSQL (pgAdmin ou psql) para a tabela 'alimento'.");
    }
}