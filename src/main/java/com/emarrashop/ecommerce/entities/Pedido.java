package com.emarrashop.ecommerce.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.emarrashop.ecommerce.enums.StatusPedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data_pedido")
	private LocalDateTime dataPedido;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status_pedido", nullable = false)
	private StatusPedido statusPedido;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "pagamento_id")
	private FormaPagamento formaPagamento;
	
	@OneToMany(mappedBy = "pedido")
	private List<PedidoItem> itens;

	public Pedido(Long id, LocalDateTime dataPedido, StatusPedido statusPedido, Cliente cliente,
			FormaPagamento formaPagamento, List<PedidoItem> itens) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
		this.formaPagamento = formaPagamento;
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
}
