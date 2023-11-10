<h1>buscadorCEP</h1>

<h3> Versão Java: java 17.0.8 2023-07-18 LTS</h3> 
<h3>Versão JDK: 17 (Oracle OpenJDK version 17.0.8)</h3>

<h2> Sobre a aplicação.</h2>
O programa realiza buscas  de endereço e dados de geolocalização por intermedio de requisições a plataforma viacep.com.br. 
por meio do consumo da API do proprio site.
<p><b>O programa salva, em arquivos individuais de extensão  ".json",  os dados retornados na busca por CEP,
além de criar uma coleção e registra-la em 1 unico arquivo ".json" </b></p> 


<h2> Uso a biblioteca GSON nessa aplicação:</h2>
A aplicação faz uso da biblioteca GSON goole, esta foi usada para converter os arquivos json em classe.
Estas classes , por sua vez, permitem uam configuração mais objetiva dos dados retornados pelo consumo da API.

<h2>A biblioteca e sua configuração:</h2>
Baixar um arquivo jar da biblioteca em questão  e o adicionar o arquivo "gson-2.10.1.jar" como dependencia ao projeto.
link da biblioteca: https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1

## Sobre a API: 
A aplicação usa a API viacep.com.br , foi usada para acessas as informações de  geolocalização  como:
cep, logradouro, complemento:"lados da rua", bairro, localidade,
uf,cod. ibge, codigo gia, codigo d ddd ,codigo siafi.

Para esta aplicação usamos apelas os dados de cep, logradouro e bairro.

### Link da API: https://viacep.com.br/ 

