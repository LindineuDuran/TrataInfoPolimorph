package com.lduran.infopolimorph.model;

public class ApuracaoICMS extends ObjectBI
{
	private Long apuracaoICMS_id = new Long(0);
	private String dataInicial = "";
	private String dataFinal = "";
	private double totalDebitos = 0.0;
	private double ajusteDebitos = 0.0;
	private double totalAjustesDebitos = 0.0;
	private double estornoCreditos = 0.0;
	private double totalCreditos = 0.0;
	private double ajusteCreditos = 0.0;
	private double totalAjustesCreditos = 0.0;
	private double estornoDebitos = 0.0;
	private double saldoCredorAnterior = 0.0;
	private double saldoApurado = 0.0;
	private double totalDeducoes = 0.0;
	private double icmsRecolher = 0.0;
	private double saldoCredorTransp = 0.0;
	private double valorRecolhExtraApur = 0.0;
	private String uf = "";
	private String apuracao = "";
	private String utilizacao = "";
	private int sequencia = 0;
	private String organizacao = "";

	/**
	 * @return the dataInicial
	 */
	public String getDataInicial()
	{
		return this.dataInicial;
	}

	/**
	 * @param dataInicial the dataInicial to set
	 */
	public void setDataInicial(String dataInicial)
	{
		this.dataInicial = dataInicial;
	}

	/**
	 * @return the dataFinal
	 */
	public String getDataFinal()
	{
		return this.dataFinal;
	}

	/**
	 * @param dataFinal the dataFinal to set
	 */
	public void setDataFinal(String dataFinal)
	{
		this.dataFinal = dataFinal;
	}

	/**
	 * @return the totalDebitos
	 */
	public double getTotalDebitos()
	{
		return this.totalDebitos;
	}

	/**
	 * @param totalDebitos the totalDebitos to set
	 */
	public void setTotalDebitos(double totalDebitos)
	{
		this.totalDebitos = totalDebitos;
	}

	/**
	 * @return the ajusteDebitos
	 */
	public double getAjusteDebitos()
	{
		return this.ajusteDebitos;
	}

	/**
	 * @param ajusteDebitos the ajusteDebitos to set
	 */
	public void setAjusteDebitos(double ajusteDebitos)
	{
		this.ajusteDebitos = ajusteDebitos;
	}

	/**
	 * @return the totalAjustesDebitos
	 */
	public double getTotalAjustesDebitos()
	{
		return this.totalAjustesDebitos;
	}

	/**
	 * @param totalAjustesDebitos the totalAjustesDebitos to set
	 */
	public void setTotalAjustesDebitos(double totalAjustesDebitos)
	{
		this.totalAjustesDebitos = totalAjustesDebitos;
	}

	/**
	 * @return the estornoCreditos
	 */
	public double getEstornoCreditos()
	{
		return this.estornoCreditos;
	}

	/**
	 * @param estornoCreditos the estornoCreditos to set
	 */
	public void setEstornoCreditos(double estornoCreditos)
	{
		this.estornoCreditos = estornoCreditos;
	}

	/**
	 * @return the totalCreditos
	 */
	public double getTotalCreditos()
	{
		return this.totalCreditos;
	}

	/**
	 * @param totalCreditos the totalCreditos to set
	 */
	public void setTotalCreditos(double totalCreditos)
	{
		this.totalCreditos = totalCreditos;
	}

	/**
	 * @return the ajusteCreditos
	 */
	public double getAjusteCreditos()
	{
		return this.ajusteCreditos;
	}

	/**
	 * @param ajusteCreditos the ajusteCreditos to set
	 */
	public void setAjusteCreditos(double ajusteCreditos)
	{
		this.ajusteCreditos = ajusteCreditos;
	}

	/**
	 * @return the totalAjustesCreditos
	 */
	public double getTotalAjustesCreditos()
	{
		return this.totalAjustesCreditos;
	}

	/**
	 * @param totalAjustesCreditos the totalAjustesCreditos to set
	 */
	public void setTotalAjustesCreditos(double totalAjustesCreditos)
	{
		this.totalAjustesCreditos = totalAjustesCreditos;
	}

	/**
	 * @return the estornoDebitos
	 */
	public double getEstornoDebitos()
	{
		return this.estornoDebitos;
	}

	/**
	 * @param estornoDebitos the estornoDebitos to set
	 */
	public void setEstornoDebitos(double estornoDebitos)
	{
		this.estornoDebitos = estornoDebitos;
	}

	/**
	 * @return the saldoCredorAnterior
	 */
	public double getSaldoCredorAnterior()
	{
		return this.saldoCredorAnterior;
	}

	/**
	 * @param saldoCredorAnterior the saldoCredorAnterior to set
	 */
	public void setSaldoCredorAnterior(double saldoCredorAnterior)
	{
		this.saldoCredorAnterior = saldoCredorAnterior;
	}

	/**
	 * @return the saldoApurado
	 */
	public double getSaldoApurado()
	{
		return this.saldoApurado;
	}

	/**
	 * @param saldoApurado the saldoApurado to set
	 */
	public void setSaldoApurado(double saldoApurado)
	{
		this.saldoApurado = saldoApurado;
	}

	/**
	 * @return the totalDeducoes
	 */
	public double getTotalDeducoes()
	{
		return this.totalDeducoes;
	}

	/**
	 * @param totalDeducoes the totalDeducoes to set
	 */
	public void setTotalDeducoes(double totalDeducoes)
	{
		this.totalDeducoes = totalDeducoes;
	}

	/**
	 * @return the icmsRecolher
	 */
	public double getIcmsRecolher()
	{
		return this.icmsRecolher;
	}

	/**
	 * @param icmsRecolher the icmsRecolher to set
	 */
	public void setIcmsRecolher(double icmsRecolher)
	{
		this.icmsRecolher = icmsRecolher;
	}

	/**
	 * @return the saldoCredorTransp
	 */
	public double getSaldoCredorTransp()
	{
		return this.saldoCredorTransp;
	}

	/**
	 * @param saldoCredorTransp the saldoCredorTransp to set
	 */
	public void setSaldoCredorTransp(double saldoCredorTransp)
	{
		this.saldoCredorTransp = saldoCredorTransp;
	}

	/**
	 * @return the valorRecolhExtraApur
	 */
	public double getValorRecolhExtraApur()
	{
		return this.valorRecolhExtraApur;
	}

	/**
	 * @param valorRecolhExtraApur the valorRecolhExtraApur to set
	 */
	public void setValorRecolhExtraApur(double valorRecolhExtraApur)
	{
		this.valorRecolhExtraApur = valorRecolhExtraApur;
	}

	/**
	 * @return the uf
	 */
	public String getUf()
	{
		return this.uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf)
	{
		this.uf = uf;
	}

	/**
	 * @return the apuracao
	 */
	public String getApuracao()
	{
		return this.apuracao;
	}

	/**
	 * @param apuracao the apuracao to set
	 */
	public void setApuracao(String apuracao)
	{
		this.apuracao = apuracao;
	}

	/**
	 * @return the utilizacao
	 */
	public String getUtilizacao()
	{
		return this.utilizacao;
	}

	/**
	 * @param utilizacao the utilizacao to set
	 */
	public void setUtilizacao(String utilizacao)
	{
		this.utilizacao = utilizacao;
	}

	/**
	 * @return the sequencia
	 */
	public int getSequencia()
	{
		return this.sequencia;
	}

	/**
	 * @param sequencial the sequencia to set
	 */
	public void setSequencia(int sequencia)
	{
		this.sequencia = sequencia;
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
		return "ApuracaoICMS [apuracaoICMS_id=" + this.apuracaoICMS_id + ", dataInicial=" + this.dataInicial + ", dataFinal="
				+ this.dataFinal + ", totalDebitos=" + this.totalDebitos + ", ajusteDebitos=" + this.ajusteDebitos
				+ ", totalAjustesDebitos=" + this.totalAjustesDebitos + ", estornoCreditos=" + this.estornoCreditos
				+ ", totalCreditos=" + this.totalCreditos + ", ajusteCreditos=" + this.ajusteCreditos + ", totalAjustesCreditos="
				+ this.totalAjustesCreditos + ", estornoDebitos=" + this.estornoDebitos + ", saldoCredorAnterior="
				+ this.saldoCredorAnterior + ", saldoApurado=" + this.saldoApurado + ", totalDeducoes=" + this.totalDeducoes
				+ ", icmsRecolher=" + this.icmsRecolher + ", saldoCredorTransp=" + this.saldoCredorTransp
				+ ", valorRecolhExtraApur=" + this.valorRecolhExtraApur + ", uf=" + this.uf + ", apuracao=" + this.apuracao
				+ ", utilizacao=" + this.utilizacao + ", sequencia=" + this.sequencia + ", organizacao=" + this.organizacao + "]";
	}
}