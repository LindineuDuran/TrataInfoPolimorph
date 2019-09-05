package com.lduran.infopolimorph.service;

import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lduran.infopolimorph.model.ApuracaoICMS;
import com.lduran.infopolimorph.model.ObjectBI;

@Service
public class ApuracaoServiceImpl implements ObjectService
{
	@Override
	/**
	 * Gera a lista de Objetos para a lista<String> fornecida
	 * 
	 * @param fileContent
	 * @param org
	 * @return
	 */
	public List<? extends ObjectBI> getObjectList(List<String> fileContent)
	{
		List<ApuracaoICMS> objectListApura = new LinkedList<>();

		for (String linha : fileContent)
		{
			ApuracaoICMS apura = new ApuracaoICMS();

			if (!linha.contains("DataInicial"))
			{
				String[] item = linha.replace(".", "").replace(",", ".").split(";");

				if ((item.length > 0) && (item[0] != null)) {apura.setDataInicial(item[0]);}
				if ((item.length > 1) && (item[1] != null)) {apura.setDataFinal(item[1]);}
				if ((item.length > 2) && (item[2] != null)) {apura.setTotalDebitos(Double.parseDouble(item[2]));}
				if ((item.length > 3) && (item[3] != null)) {apura.setAjusteDebitos(Double.parseDouble(item[3]));}
				if ((item.length > 4) && (item[4] != null)) {apura.setTotalAjustesDebitos(Double.parseDouble(item[4]));}
				if ((item.length > 5) && (item[5] != null)) {apura.setEstornoCreditos(Double.parseDouble(item[5]));}
				if ((item.length > 6) && (item[6] != null)) {apura.setTotalCreditos(Double.parseDouble(item[6]));}
				if ((item.length > 7) && (item[7] != null)) {apura.setAjusteCreditos(Double.parseDouble(item[7]));}
				if ((item.length > 8) && (item[8] != null)) {apura.setTotalAjustesCreditos(Double.parseDouble(item[8]));}
				if ((item.length > 9) && (item[9] != null)) {apura.setEstornoDebitos(Double.parseDouble(item[9]));}
				if ((item.length > 10) && (item[10] != null)) {apura.setSaldoCredorAnterior(Double.parseDouble(item[10]));}
				if ((item.length > 11) && (item[11] != null)) {apura.setSaldoApurado(Double.parseDouble(item[11]));}
				if ((item.length > 12) && (item[12] != null)) {apura.setTotalDeducoes(Double.parseDouble(item[12]));}
				if ((item.length > 13) && (item[13] != null)) {apura.setIcmsRecolher(Double.parseDouble(item[13]));}
				if ((item.length > 14) && (item[14] != null)) {apura.setSaldoCredorTransp(Double.parseDouble(item[14]));}
				if ((item.length > 15) && (item[15] != null)) {apura.setValorRecolhExtraApur(Double.parseDouble(item[15]));}
				if ((item.length > 16) && (item[16] != null)) {apura.setUf(item[16]);}
				if ((item.length > 17) && (item[17] != null)) {apura.setApuracao(item[17]);}
				if ((item.length > 18) && (item[18] != null)) {apura.setUtilizacao(item[18]);}
				if ((item.length > 19) && (item[19] != null)) {apura.setSequencia(Integer.parseInt(item[19]));}
				if ((item.length > 20) && (item[20] != null)) {apura.setOrganizacao(item[20]);}

				objectListApura.add(apura);
			}
		}

		List<? extends ObjectBI> objectList = objectListApura;
		return objectList;
	}

	@Override
	public String getObjectHeader()
	{
		return "DataInicial;DataFinal;TotalDeDebitos;AjustesDeDebitos;TotalDeAjustesDeDebitos;EstornosDeCreditos;TotalDeCreditos;AjustesDeCreditos;TotalDeAjustesDeCreditos;EstornosDeDebitos;SaldoCredorAnterior;SaldoApurado;TotalDeDeducoes;IcmsARecolher;SaldoCredorATransportar;ValoresRecolhidosExtraApuracao;Estado;Apuracao;Utilizacao;Sequencia;IdOrganizacao";
	}

	@Override
	public String getObjectContent(ObjectBI obj)
	{
		NumberFormat formatadorMoeda = NumberFormat.getNumberInstance();

		ApuracaoICMS apuracao = (ApuracaoICMS) obj;

		return apuracao.getDataInicial() + ";" + apuracao.getDataFinal() + ";" + formatadorMoeda.format(apuracao.getTotalDebitos()) + ";"
		+ formatadorMoeda.format(apuracao.getAjusteDebitos()) + ";" + formatadorMoeda.format(apuracao.getTotalAjustesDebitos()) + ";"
		+ formatadorMoeda.format(apuracao.getEstornoCreditos()) + ";" + formatadorMoeda.format(apuracao.getTotalCreditos()) + ";"
		+ formatadorMoeda.format(apuracao.getAjusteCreditos()) + ";" + formatadorMoeda.format(apuracao.getTotalAjustesCreditos()) + ";"
		+ formatadorMoeda.format(apuracao.getEstornoDebitos()) + ";" + formatadorMoeda.format(apuracao.getSaldoCredorAnterior()) + ";"
		+ formatadorMoeda.format(apuracao.getSaldoApurado()) + ";" + formatadorMoeda.format(apuracao.getTotalDeducoes()) + ";"
		+ formatadorMoeda.format(apuracao.getIcmsRecolher()) + ";" + formatadorMoeda.format(apuracao.getSaldoCredorTransp()) + ";"
		+ formatadorMoeda.format(apuracao.getValorRecolhExtraApur()) + ";" + apuracao.getUf() + ";" + apuracao.getApuracao() + ";" + apuracao.getUtilizacao() + ";"
		+ apuracao.getSequencia() + ";" + apuracao.getOrganizacao();
	}
}
