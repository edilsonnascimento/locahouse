package locahouse;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public List<Endereco> enderecos() {

		List<Endereco> enderecos = new ArrayList<Endereco>();

		enderecos.add(new Endereco("Rua Xingu", 187, new Cidade(3526, "Apucarana")));
		enderecos.add(new Endereco("Rua Peruibe da Cunha", 4658, new Cidade(786, "Cascavel")));
		enderecos.add(new Endereco("Avenida Brasil", 1566, new Cidade(654, "Curitiba")));
		enderecos.add(new Endereco("Avenida Afonso Pena", 688, new Cidade(998, "São José dos Pinhais")));
		enderecos.add(new Endereco("Travessa Boa Morte", 416, new Cidade(857, "Pinhalzinho do Sul")));
		enderecos.add(new Endereco("Beco tanquino", 1100, new Cidade(877, "Araucária")));
		enderecos.add(new Endereco("Rua Bentivi", 658, new Cidade(857, "Pinhalzinho do Sul")));
		enderecos.add(new Endereco("Esquina das Alamedas", 1100, new Cidade(877, "Chopinzinho")));

		return enderecos;
	}

	public List<Proprietario> proprietarios() {

		List<Proprietario> proprietarios = new ArrayList<Proprietario>();
		List<Endereco> enderecosProprietarios = enderecos();

		proprietarios.add(new Proprietario(81316971503l, "Marceleno Pão e Vinho", enderecosProprietarios.get(0)));
		proprietarios.add(new Proprietario(44227855322l, "Pio de Pietraltina", enderecosProprietarios.get(1)));
		proprietarios.add(new Proprietario(55153469980l, "João Paulo 2", enderecosProprietarios.get(2)));
		proprietarios.add(new Proprietario(63474583573l, "Augostinho de Hipona", enderecosProprietarios.get(3)));

		return proprietarios;

	}

	public List<Apartamento> apartamentos() {

		List<Apartamento> apartamentos = new ArrayList<Apartamento>();
		List<Endereco> enderecosApartamentos = enderecos();
		List<Proprietario> proprietariosApartamentos = proprietarios();

		apartamentos.add(new Apartamento("Caiua", 55, "Alvenaria", 660, enderecosApartamentos.get(4), proprietariosApartamentos.get(0)));
		apartamentos.add(new Apartamento("Tibuia", 185, "Madeira", 1100, enderecosApartamentos.get(5), proprietariosApartamentos.get(1)));
		apartamentos.add(new Apartamento("Tapera", 265, "Mista", 1200, enderecosApartamentos.get(6), proprietariosApartamentos.get(2)));
		apartamentos.add(new Apartamento("Tapera", 85, "Mista", 900, enderecosApartamentos.get(7), proprietariosApartamentos.get(3)));

		return apartamentos;
	}
	
	public void mostraAparatamentos() {
		System.out.println(apartamentos());
	}
	
	public List<Casa> casas(){
		
		List<Casa> casas = new ArrayList<Casa>();
		List<Endereco> enderecosCasas = enderecos();
		List<Proprietario> proprietariosCasas = proprietarios();
		
		casas.add(new Casa("Barroco", 26, "Alvenaria", 5000, enderecosCasas.get(5), proprietariosCasas.get(3)));
		casas.add(new Casa("Rococô", 5, "Alvenaria", 660, enderecosCasas.get(0), proprietariosCasas.get(1)));
		casas.add(new Casa("BNH", 4, "Alvenaria", 250, enderecosCasas.get(2), proprietariosCasas.get(2)));
		casas.add(new Casa("Simples", 3, "Madeira", 160, enderecosCasas.get(1), proprietariosCasas.get(3)));
		
		return casas;
	}
	
	public void mostraListaCasas() {
		System.out.println(casas());
	}

}

