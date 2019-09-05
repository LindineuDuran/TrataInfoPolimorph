package com.lduran.infopolimorph.model;

public enum Utilizacao
{
	U0("OUTROS DEBITOS"),
	U1("ESTORNO DE CREDITOS"),
	U2("OUTROS CREDITOS"),
	U3("ESTORNO DE DEBITOS"),
	U4("DEDUCOES DO IMPOSTO APURADO"),
	U5("DEBITO ESPECIAL");

	private String descricao;

	/**
	 * @param descricao
	 */
	private Utilizacao(String descricao)
	{
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao()
	{
		return this.descricao;
	}
}
