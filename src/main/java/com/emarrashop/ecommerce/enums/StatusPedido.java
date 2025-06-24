package com.emarrashop.ecommerce.enums;

public enum StatusPedido {
	PENDENTE_PAGAMENTO(0, "Pendente Pagamento"),
    AGUARDANDO_CONFIRMACAO(1, "Aguardando confirmação"),
    PAGO(2, "Pago"),
    EM_PROCESSAMENTO(3, "Em processamento"),
    EM_PRODUCAO(4, "Em produção"),
    ENVIADO(5, "Enviado"),
    ENTREGUE(6, "Entregue"),
    CANCELADO(7, "Cancelado"),
    DEVOLVIDO(8, "Devolvido"),
    REEMBOLSADO(9, "Reembolsado"),
    FALHA_PAGAMENTO(10, "Falha no pagamento"),
    AGUARDANDO_ESTOQUE(11, "Aguardando estoque");
	
	private Integer id;
	private String nome;
	
	private StatusPedido(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
