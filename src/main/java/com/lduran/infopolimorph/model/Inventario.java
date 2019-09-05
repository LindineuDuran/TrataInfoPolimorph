package com.lduran.infopolimorph.model;

import java.math.BigDecimal;

public class Inventario extends ObjectBI
{
	private String dataInventario = "";
	public String IdItem = "";
	private String unidade = "";
	private double quantidade = 0.0;
	private BigDecimal valorUnitario = new BigDecimal(0);
	private BigDecimal valorTotal = new BigDecimal(0);
	private String propriedade = "";
	private String participante = "";
	private String textoComplementar = "";
	private String contaContabil = "";
	private BigDecimal valorTotIR = new BigDecimal(0);
	private String organizacao = "";

	/**
	 * @return the dataInventario
	 */
	public String getDataInventario()
	{
		return this.dataInventario;
	}

	/**
	 * @param dataInventario the dataInventario to set
	 */
	public void setDataInventario(String dataInventario)
	{
		this.dataInventario = dataInventario;
	}

	/**
	 * @return the idItem
	 */
	public String getIdItem()
	{
		return this.IdItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(String idItem)
	{
		this.IdItem = idItem;
	}

	/**
	 * @return the unidade
	 */
	public String getUnidade()
	{
		return this.unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(String unidade)
	{
		this.unidade = unidade;
	}

	/**
	 * @return the quantidade
	 */
	public double getQuantidade()
	{
		return this.quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(double quantidade)
	{
		this.quantidade = quantidade;
	}

	/**
	 * @return the valorUnitario
	 */
	public BigDecimal getValorUnitario()
	{
		return this.valorUnitario;
	}

	/**
	 * @param valorUnitario the valorUnitario to set
	 */
	public void setValorUnitario(BigDecimal valorUnitario)
	{
		this.valorUnitario = valorUnitario;
	}

	/**
	 * @return the valorTotal
	 */
	public BigDecimal getValorTotal()
	{
		return this.valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(BigDecimal valorTotal)
	{
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the propriedade
	 */
	public String getPropriedade()
	{
		return this.propriedade;
	}

	/**
	 * @param propriedade the propriedade to set
	 */
	public void setPropriedade(String propriedade)
	{
		this.propriedade = propriedade;
	}

	/**
	 * @return the participante
	 */
	public String getParticipante()
	{
		return this.participante;
	}

	/**
	 * @param participante the participante to set
	 */
	public void setParticipante(String participante)
	{
		this.participante = participante;
	}

	/**
	 * @return the textoComplementar
	 */
	public String getTextoComplementar()
	{
		return this.textoComplementar;
	}

	/**
	 * @param textoComplementar the textoComplementar to set
	 */
	public void setTextoComplementar(String textoComplementar)
	{
		this.textoComplementar = textoComplementar;
	}

	/**
	 * @return the contaContabil
	 */
	public String getContaContabil()
	{
		return this.contaContabil;
	}

	/**
	 * @param contaContabil the contaContabil to set
	 */
	public void setContaContabil(String contaContabil)
	{
		this.contaContabil = contaContabil;
	}

	/**
	 * @return the valorTotIR
	 */
	public BigDecimal getValorTotIR()
	{
		return this.valorTotIR;
	}

	/**
	 * @param valorTotIR the valorTotIR to set
	 */
	public void setValorTotIR(BigDecimal valorTotIR)
	{
		this.valorTotIR = valorTotIR;
	}

	/**
	 * @return the organizacao
	 */
	public String getOrganizacao()
	{
		return this.organizacao;
	}

	/**
	 * @param organizacao the organizacao to set
	 */
	public void setOrganizacao(String organizacao)
	{
		this.organizacao = organizacao;
	}

	@Override
	public String toString()
	{
		return "Inventario [dataInventario=" + this.dataInventario + ", IdItem=" + this.IdItem + ", unidade=" + this.unidade
				+ ", quantidade=" + this.quantidade + ", valorUnitario=" + this.valorUnitario + ", valorTotal=" + this.valorTotal
				+ ", propriedade=" + this.propriedade + ", participante=" + this.participante + ", textoComplementar="
				+ this.textoComplementar + ", contaContabil=" + this.contaContabil + ", valorTotIR=" + this.valorTotIR
				+ ", organizacao=" + this.organizacao + "]";
	}
}