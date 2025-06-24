package com.emarrashop.ecommerce.enums;

public enum PerfilUsuario {
	ADM(0, "Administrador"),
	USER(1, "Usuário");
	
	private Integer id;
	private String nome;
	
	private PerfilUsuario(Integer id, String nome) {
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
	
	public static PerfilUsuario fromId(Integer id) {
        for (PerfilUsuario perfil : values()) {
            if (perfil.getId().equals(id)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Id de perfil inválido: " + id);
    }
}
