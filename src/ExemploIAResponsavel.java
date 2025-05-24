// src/ExemploIAResponsavel.java
public class ExemploIAResponsavel {

    public static void main(String[] args) {
        String prompt = "Escreva uma mensagem de boas-vindas acessível para uma pessoa com deficiência auditiva.";

        gerarConteudoSeguro(prompt);
    }

    public static void gerarConteudoSeguro(String prompt) {
        // Simula o uso de um modelo de IA com filtro de conteúdo
        if (prompt.toLowerCase().contains("ofensivo") || prompt.toLowerCase().contains("piada")) {
            System.out.println("⚠️ Este conteúdo foi bloqueado pelos filtros de segurança.");
        } else {
            System.out.println("✅ Conteúdo gerado: Olá! Seja muito bem-vindo! Aqui usamos linguagem clara e acessível para todos.");
        }
    }
}