import api from '../../../api';
import React, { useRef } from 'react';
import '../../Formularioscadastro/Formcadentregadora/Formcadentregadora.css'

const Formcadentregadora = () => {
    const nomecompletoEntregadora = useRef()
    const cpfEntregadora  = useRef()
    const enderecoEntregadora  = useRef()
    const emailEntregadora  = useRef()
    const telefoneEntregadora  = useRef()
    const loginEntregadora  = useRef()
    const senhaEntregadora  = useRef()

    function enviarDados(event) {
        event.preventDefault()
        console.log(nomecompletoEntregadora.current.value)
        api.post("/cadastroentregadora/", {
            nomecompleto: nomecompletoEntregadora.current.value,
            cpf: cpfEntregadora.current.value,
            enderecocompleto: enderecoEntregadora.current.value,
            email: emailEntregadora.current.value,
            telefone: telefoneEntregadora.current.value,
            login: loginEntregadora.current.value,
            senha: senhaEntregadora.current.value,
        }).then((res) => console.log(res)).catch((err) => console.log(err))
    }


    return (
        <div>
            <div className='container-cadastro'>
                <form onSubmit={enviarDados}>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Nome Completo</label>
                            <input type="text" className="form-control" ref={nomecompletoEntregadora} placeholder="Digite aqui seu nome completo..." />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >CPF</label>
                            <input type="text" className="form-control" ref={cpfEntregadora} placeholder="Só números sem pontos" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Endereço completo</label>
                            <input type="text" className="form-control" ref={enderecoEntregadora} placeholder="Rua, nºx, apt y.." />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Email</label>
                            <input type="text" className="form-control" ref={emailEntregadora} placeholder="Email" />
                        </div>
                        <div className="form-group col-md-6">
                            <label >Telefone</label>
                            <input type="text" className="form-control" ref={telefoneEntregadora} placeholder="DDDxxxxx sem () ou -" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Login</label>
                            <input type="text" className="form-control" ref={loginEntregadora} placeholder="Login" />
                        </div>
                        <div className="form-group col-md-6">
                            <label >Senha</label>
                            <input type="text" className="form-control" ref={senhaEntregadora} placeholder="Senha" />
                        </div>
                    </div>
                    <button type="submit" className="btn btn-primary" >Enviar!</button>
                </form>
            </div >
        </div >
    );
}
export default Formcadentregadora;