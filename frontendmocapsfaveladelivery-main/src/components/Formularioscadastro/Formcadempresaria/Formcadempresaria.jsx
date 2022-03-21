import api from '../../../api';
import React, { useRef } from 'react';
import '../../Formularioscadastro/Formcadempresaria/Formcadempresaria.css'

const Formcadempresaria = () => {
    const nomecompletoEmpresaria = useRef()
    const cpfEmpresaria = useRef()
    const enderecoEmpresaria = useRef()
    const emailEmpresaria = useRef()
    const telefoneEmpresaria = useRef()
    const loginEmpresaria = useRef()
    const senhaEmpresaria = useRef()

    function enviarDados(event) {
        event.preventDefault()
        console.log(nomecompletoEmpresaria.current.value)
        api.post("/cadastroempresaria/", {
            nomecompleto: nomecompletoEmpresaria.current.value,
            cpf: cpfEmpresaria.current.value,
            enderecocompleto: enderecoEmpresaria.current.value,
            email: emailEmpresaria.current.value,
            telefone: telefoneEmpresaria.current.value,
            login: loginEmpresaria.current.value,
            senha: senhaEmpresaria.current.value,
        }).then((res) => console.log(res)).catch((err) => console.log(err))
    }

    return (
        <div>
            <div className='container-cadastro'>
                <form onSubmit={enviarDados}>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Nome Completo</label>
                            <input type="text" className="form-control" ref={nomecompletoEmpresaria} placeholder="Digite aqui seu nome completo..." />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >CPF</label>
                            <input type="text" className="form-control" ref={cpfEmpresaria} placeholder="Só números sem pontos" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Endereço completo</label>
                            <input type="text" className="form-control" ref={enderecoEmpresaria} placeholder="Rua, nºx, apt y.." />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Email</label>
                            <input type="text" className="form-control" ref={emailEmpresaria} placeholder="Email" />
                        </div>
                        <div className="form-group col-md-6">
                            <label >Telefone</label>
                            <input type="text" className="form-control" ref={telefoneEmpresaria} placeholder="DDDxxxxx sem () ou -" />
                        </div>
                    </div>
                    <div className="row">
                        <div className="form-group col-md-6">
                            <label >Login</label>
                            <input type="text" className="form-control" ref={loginEmpresaria} placeholder="Login" />
                        </div>
                        <div className="form-group col-md-6">
                            <label >Senha</label>
                            <input type="text" className="form-control" ref={senhaEmpresaria} placeholder="Senha" />
                        </div>
                    </div>
                    <button type="submit" className="btn btn-primary">Enviar!</button>
                </form>
            </div >
        </div >

    );
}
export default Formcadempresaria;