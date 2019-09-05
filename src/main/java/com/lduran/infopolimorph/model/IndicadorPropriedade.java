package com.lduran.infopolimorph.model;

public enum IndicadorPropriedade
{
	IP0("Item de propriedade do informante e em seu poder"),
	IP1("Item de propriedade do informante em posse de terceiros"),
	IP2("Item de propriedade de terceiros em posse do informante");

	private String descricao;

	/**
	 * @param descricao
	 */
	private IndicadorPropriedade(String descricao)
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

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
}