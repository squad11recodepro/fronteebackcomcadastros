import api from '../../../api';
import React, { useRef } from 'react';
import '../../Formularioscadastro/Formcadcliente/Formcadcliente.css'

const Formcardcliente = () => {
    const nomecompletoCliente = useRef()
    const cpfCliente = useRef()
    const enderecoCliente = useRef()
    const emailCliente = useRef()
    const telefoneCliente = useRef()
    const loginCliente = useRef()
    const senhaCliente = useRef()

    function enviarDados(event) {
        event.preventDefault()
        console.log(nomecompletoCliente.current.value)
        api.post("/cadastrocliente/", {
            nomecompleto: nomecompletoCliente.current.value,
            cpf: cpfCliente.current.value,
            enderecocompleto: enderecoCliente.current.value,
            email: emailCliente.current.value,
            telefone: telefoneCliente.current.value,
            login: loginCliente.current.value,
            senha: senhaCliente.current.value,
        }).then((res) => console.log(res)).catch((err) => console.log(err))
    }


    return (
        <div>
            <div className='container-cadastro'>
                <form onSubmit={enviarDados}>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Nome Completo</label>
                            <input type="text" className="form-control" ref={nomecompletoCliente} placeholder="Digite aqui seu nome completo..." />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >CPF</label>
                            <input type="text" className="form-control" ref={cpfCliente} placeholder="Só números sem pontos" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Endereço completo</label>
                            <input type="text" className="form-control" ref={enderecoCliente} placeholder="Rua, nºx, apt y.." />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Email</label>
                            <input type="text" className="form-control" ref={emailCliente} placeholder="Email" />
                        </div>
                        <div className="form-group col-md-6">
                            <label >Telefone</label>
                            <input type="text" className="form-control" ref={telefoneCliente} placeholder="DDDxxxxx sem () ou -" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Login</label>
                            <input type="text" className="form-control" ref={loginCliente} placeholder="Login" />
                        </div>
                        <div className="form-group col-md-6">
                            <label >Senha</label>
                            <input type="text" className="form-control" ref={senhaCliente} placeholder="Senha" />
                        </div>
                    </div>
                    <button type="submit" className="btn btn-primary" >Enviar!</button>
                </form>
            </div >
        </div >
    );
}
export default Formcardcliente;