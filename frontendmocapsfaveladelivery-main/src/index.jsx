import React from 'react'
import ReactDOM from 'react-dom'
import App from './App'
import { BrowserRouter as Router,Route, Routes,} from 'react-router-dom';
import { Login } from './components/pages/Login/Login';
import Cadastro from './components/pages/Cadastro/Cadastro';
import Perfil from './components/pages/Perfil/Perfil';
import AvaliacaoCliente from './components/pages/Avaliacao/AvaliacaoCliente';
import Cadastrocliente from './components/pages/Cadastrocliente/Cadastrocliente';
import Cadastroempresaria from './components/pages/Cadastroempresaria/Cadastroempresaria';
import Cadastroentregadora from './components/pages/Cadastroentregadora/Cadastroentregadora';


ReactDOM.render(
  <React.StrictMode>
   
    <App />
                
    <Router>         
           <Routes> 
            <Route path="/Login" exact element={<Login/>}></Route>
            <Route path="/Cadastro" element={<Cadastro/>}></Route>
            <Route path="/Perfil" element={<Perfil/>}></Route>
            <Route path="/AvaliacaoCliente" element={<AvaliacaoCliente/>}></Route> 
            <Route path="/Cadastrocliente" element={<Cadastrocliente/>}></Route> 
            <Route path="/Cadastroempresaria" element={<Cadastroempresaria/>}></Route> 
            <Route path="/Cadastroentregadora" element={<Cadastroentregadora/>}></Route> 

                             
                  
                     
           </Routes>
       </Router>    

  </React.StrictMode>,
  document.getElementById('root')
)
