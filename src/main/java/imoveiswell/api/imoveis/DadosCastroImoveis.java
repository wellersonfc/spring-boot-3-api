package imoveiswell.api.imoveis;

import imoveiswell.api.endereco.DadosEndereco;

public record DadosCastroImoveis( String nome, String email, String telefone, String imagens, TipodeImovel tipodeimovel, DadosEndereco dadosendereco ) {

}
