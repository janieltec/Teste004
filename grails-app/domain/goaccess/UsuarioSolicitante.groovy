package goaccess

class UsuarioSolicitante {

	String nome
	String cpf
	String email
	String setor
	String celular
	String login
	String senha
	String hashSenha
	Endereco endereco
		
	static hasMany = [solicitacao:Solicitacao]	
	
	static belongsTo = Endereco
	
	String ToString () {
		"${this.nome}"
	}
	
	
    static constraints = {
		nome(nullable:false,blank:false,unique:true)
		cpf(blank:false,unique:true)
		email(email:true,blank:false)
		setor(blank:false)
		celular(blank:false)
		login(blank:false,unique:true)
		senha(blank:false,unique:true)
    }
}
