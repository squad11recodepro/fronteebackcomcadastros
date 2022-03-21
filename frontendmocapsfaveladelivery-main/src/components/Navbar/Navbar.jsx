/* eslint-disable jsx-a11y/alt-text */
/* eslint-disable import/no-anonymous-default-export */
/* eslint-disable jsx-a11y/anchor-is-valid */
import './Navbar.css'
import logo from "../../components/img/logo.png"


export default () => {

  return (
    <container className="navbar">
      <div className='row'>
        <img src={logo} />
        <p>Fulano de tal</p>
        <p>Empreendimento fulano de tal</p>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="container-fluid">
            <div class="collapse navbar-collapse sidebar">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link " aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link " aria-current="page" href="#">Quem somos</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link " aria-current="page" href="#">Pedidos</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link " aria-current="page" href="#">Contatos</a>
                </li>
                <p>© 2022 Favela Delivery</p>
              </ul>
            </div>
          </div>
        </nav>
      </div>
    </container>
  )
} 