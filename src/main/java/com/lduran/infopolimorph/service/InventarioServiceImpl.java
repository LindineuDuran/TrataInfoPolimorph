package com.lduran.infopolimorph.service;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lduran.infopolimorph.model.Inventario;
import com.lduran.infopolimorph.model.ObjectBI;
import com.lduran.infopolimorph.util.ToolsFactory;

@Service
public class InventarioServiceImpl implements ObjectService
{

	@Override
	public List<? extends ObjectBI> getObjectList(List<String> fileContent)
	{
		List<Inventario> objectListInventario = new LinkedList<>();

		for (String linha : fileContent)
		{
			Inventario inv = new Inventario();

			if (!linha.contains("DataDoInventario"))
			{
				String[] item = linha.replace(".", "").replace(",", ".").split(";");

				if ((item.length > 0) && (item[0] != null)) {inv.setDataInventario(item[0]);}
				if ((item.length > 1) && (item[1] != null)) {inv.setIdItem(item[1]);}
				if ((item.length > 2) && (item[2] != null)) {inv.setUnidade(item[2]);}
				if ((item.length > 3) && (item[3] != null) && (ToolsFactory.getInstance().isNumeric(item[3]))) {inv.setQuantidade(Double.parseDouble(item[3]));}
				if ((item.length > 4) && (item[4] != null) && (ToolsFactory.getInstance().isNumeric(item[4]))) {inv.setValorUnitario(new BigDecimal(Double.parseDouble(item[4])).setScale(2, BigDecimal.ROUND_HALF_UP));}
				if ((item.length > 5) && (item[5] != null) && (ToolsFactory.getInstance().isNumeric(item[5]))) {inv.setValorTotal(new BigDecimal(Double.parseDouble(item[5])).setScale(2, BigDecimal.ROUND_HALF_UP));}
				if ((item.length > 6) && (item[6] != null)) {inv.setPropriedade(item[6]);}
				if ((item.length > 7) && (item[7] != null)) {inv.setParticipante(item[7]);}
				if ((item.length > 8) && (item[8] != null)) {inv.setTextoComplementar(item[8]);}
				if ((item.length > 9) && (item[9] != null)) {inv.setContaContabil(item[9]);}
				if ((item.length > 10) && (item[10] != null) && (ToolsFactory.getInstance().isNumeric(item[10]))) {inv.setValorTotIR(new BigDecimal(Double.parseDouble(item[10])).setScale(2, BigDecimal.ROUND_HALF_UP));}


				objectListInventario.add(inv);
			}
		}

		List<? extends ObjectBI> objectList = objectListInventario;
		return objectList;
	}

	@Override
	public String getObjectHeader()
	{
		return "DataDoInventario;IdItem;UnidadeDeMedida;Quantidade;ValorUnitario;ValorTotalDoItem;Propriedade;IdParticipante;TextoComplementar;ContaContabil;ValorTotalDoItemParaImpostoDeRenda;IdOrganizacao";
	}

	@Override
	public String getObjectContent(ObjectBI obj)
	{
		NumberFormat formatadorMoeda = NumberFormat.getNumberInstance();

		Inventario inv = (Inventario)obj;

		return inv.getDataInventario() + ";" + inv.getIdItem() + ";" + inv.getUnidade() + ";" + formatadorMoeda.format(inv.getQuantidade()) + ";"
		+ formatadorMoeda.format(inv.getValorUnitario()) + ";" + formatadorMoeda.format(inv.getValorTotal()) + ";" + inv.getPropriedade()
		+ ";" + inv.getParticipante() + ";" + inv.getTextoComplementar() + ";" + inv.getContaContabil() + ";"
		+ formatadorMoeda.format(inv.getValorTotIR()) + ";" + inv.getOrganizacao();
	}

}
