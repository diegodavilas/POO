# POO
Material produzido durante as aulas de Programação Orientada à Objetos - POO
Atividade Prática Aula 08:	Trata-se de um projeto proposto para obtenção de parte da nota da disciplina Programação Orientada à Objeto.
				O projeto possui 3 classes:
				A classe Pessoa com atributos nome, cpf e idade;
				A classe GerenciadorDePessoa que possui metodos para gerenciar os atributos da classe pessoa; e
				A classe Main que chama o método main.

				Observação para execução
				A atribuição de nome para pessoa deverá ser com apenas um nome. Exemplo: "DIEGO" ou "Maria".
				Não use nome composto, pois houve um erro que não consegui corrigir na captura de texto. rsrs.
				
				Explicação da lógica
				A classe Pessoa possui métodos getters e setters públicos. Os atributos nome, cpf e idade são privados.
				A classe GerenciadorDePessoa recebe, pelo construtor, duas propriedades que são instâncias da classe pessoa.
				O método cadastrarPessoa1() faz o cadastro da pessoa1.
				O método cadastrarPessoa2() faz o cadastro da pessoa2.
				Os métodos cadastrarPessoa1() e cadastrarPessoa2() utilizam os métodos getters e setters herdados de pessoa.
				Os métodos atualizarPessoa1() e atualizarPessoa2() permitem a alteração dos dados nome, cpf ou idade.
				Os métodos exibirPessoa1() e exibirPessoa2() exibe os dados de cada um dos objetos instanciados.

